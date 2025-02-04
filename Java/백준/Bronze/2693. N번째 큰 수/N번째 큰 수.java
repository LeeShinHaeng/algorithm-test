import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < T; i++) {
			int f = 0, s = 0, t = 0;
			String[] input = br.readLine().split(" ");
			for(int j = 0; j < input.length; j++) {
				int tmp = Integer.parseInt(input[j]);
				if(tmp > f){
					t = s;
					s = f;
					f = tmp;
					continue;
				}
				if(tmp > s){
					t = s;
					s = tmp;
					continue;
				}
				if(tmp > t){
					t = tmp;
				}
			}

			sb.append(t).append("\n");
		}
		System.out.println(sb);
	}
}