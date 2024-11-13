import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] inorder, postorder, idxInorder;
	static StringBuilder preorder = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		inorder = new int[n];
		postorder = new int[n];
		idxInorder = new int[n + 1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			inorder[i] = Integer.parseInt(st.nextToken());
			idxInorder[inorder[i]] = i;
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			postorder[i] = Integer.parseInt(st.nextToken());
		}

		findPreorder(0, n - 1, 0, n - 1);

		System.out.println(preorder.toString());
	}

	static void findPreorder(int inStart, int inEnd, int postStart, int postEnd) {
		if (inStart > inEnd || postStart > postEnd) return;

		// postorder의 맨마지막 노드 -> 루트
		int root = postorder[postEnd];
		preorder.append(root).append(" ");

		// inorder에서 루트를 기준으로 왼쪽 오른쪽으로 나눌 수 있음
		int rootIdx = idxInorder[root];
		int leftSize = rootIdx - inStart;

		findPreorder(inStart, rootIdx - 1, postStart, postStart + leftSize - 1);
		findPreorder(rootIdx + 1, inEnd, postStart + leftSize, postEnd - 1);
	}
}