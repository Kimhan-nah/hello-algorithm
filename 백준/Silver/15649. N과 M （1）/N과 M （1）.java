import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private static int N, M;
	private static boolean[] isChecked;
	private static int[] arr;
	private static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		isChecked = new boolean[N + 1];
		arr = new int[M];
		solution(0);
		System.out.print(sb);
	}

	private static void solution(int count) {
		if (count == M) {
			for (int i = 0; i < M; ++i) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = 1; i <= N; ++i) {
			if (isChecked[i])
				continue;
			isChecked[i] = true;
			arr[count] = i;
			solution(count + 1);
			isChecked[i] = false;
		}
	}
}
