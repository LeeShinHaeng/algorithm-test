import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int[] setA = new int[n];

		Set<Integer> tmpSet = new HashSet<>();
		List<Integer> result = new ArrayList<>();
		s = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			setA[i] = Integer.parseInt(s[i]);
		}
		
		s = br.readLine().split(" ");
		for (int i = 0; i < m; i++) {
			tmpSet.add(Integer.parseInt(s[i]));
		}

		for(int a: setA){
			if(!tmpSet.contains(a)){
				result.add(a);
			}
		}

		System.out.println(result.size());
		Collections.sort(result);
		StringBuilder sb = new StringBuilder();
		for(int r: result){
			sb.append(r).append(" ");
		}
		System.out.println(sb);
	}
}