import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        int len = numbers.length;
        String[] strs = new String[len];
        
        for(int i = 0; i < len; i++){
            strs[i] = String.valueOf(numbers[i]);
        }
        
        quickSort(strs, 0, len-1);
        
        StringBuilder sb = new StringBuilder();
        for(String str: strs){
            sb.append(str);
        }
        
        String answer = sb.toString();
        return answer.startsWith("0") ? "0" : answer;
    }
    
    public static void quickSort(String[] arr, int start, int end){
        if(start >= end) return;
        
        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot-1);
        quickSort(arr, pivot+1, end);
    }
    
    public static int partition(String[] arr, int start, int end){
        String pivot = arr[end];
        
        int i = start - 1;
        
        for(int j = start; j < end; j++){
            if ((arr[j] + pivot).compareTo(pivot + arr[j]) > 0){
                i++;
                
				String temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
            }
        }
        
		String temp = arr[i + 1];
		arr[i + 1] = arr[end];
		arr[end] = temp;

		return i + 1;
    }
}