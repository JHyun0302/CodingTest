package CodingTest.SWEA.DIFF2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int testCase = 1; testCase <= T; testCase++) {
            System.out.println("#" + testCase);
            int N = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String alphabet = st.nextToken();
                int K = Integer.parseInt(st.nextToken());

                for (int j = 0; j < K; j++) {
                    sb.append(alphabet);
                    if (sb.length() == 10) {
                        System.out.println(sb.toString());
                        sb.setLength(0);
                    }
                }
            }
            if (sb.length() > 0) {
                System.out.println(sb.toString());
            }
        }
    }
}
