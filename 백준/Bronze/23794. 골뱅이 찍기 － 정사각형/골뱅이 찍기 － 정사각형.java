import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int length = n + 2;

		for (int i = 0; i < length; ++i) {
			for (int j = 0; j < length; ++j) {
				if (i >= 1 && i + 1 < length && j >= 1 && j + 1 < length) {
					sb.append(" ");
				} else {
					sb.append("@");
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
