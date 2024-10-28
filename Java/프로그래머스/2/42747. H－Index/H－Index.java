class Solution {
    public int solution(int[] citations) {
        mergeSort(citations, 0, citations.length - 1);
        
        for(int i = 0; i < citations.length; i++){
            if(i + 1 > citations[i]){
                return i;
            }
        }
        
        return citations.length;
    }
    
	private static void mergeSort(int[] arr, int left, int right) {
		if (left >= right) return;
		int mid = (left + right) / 2;

		mergeSort(arr, left, mid);
		mergeSort(arr, mid + 1, right);

		merging(arr, left, mid, right);
	}

	private static void merging(int[] arr, int left, int mid, int right) {
		int[] tmp = new int[arr.length];
		int i = left;
		int j = mid + 1;
		int k = left;

		while (i <= mid && j <= right) {
			if (arr[i] >= arr[j]) {
				tmp[k++] = arr[i++];
			} else {
				tmp[k++] = arr[j++];
			}
		}
		while (i <= mid) {
			tmp[k++] = arr[i++];
		}
		while (j <= right) {
			tmp[k++] = arr[j++];
		}
		System.arraycopy(tmp, left, arr, left, right - left + 1);
	}
}