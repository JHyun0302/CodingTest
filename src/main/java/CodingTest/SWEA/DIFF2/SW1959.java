package CodingTest.SWEA.DIFF2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW1959 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int testCase = 1; testCase <= T; testCase++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[] A = new int[N];
            int[] B = new int[M];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < A.length; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < B.length; i++) {
                B[i] = Integer.parseInt(st.nextToken());
            }

            if (N > M) {
                int[] temp = A;
                A = B;
                B = temp;
                int tmp = N;
                N = M;
                M = tmp;
            }

            int max = Integer.MIN_VALUE;
            for (int i = 0; i <= M - N; i++) {
                int sum = 0;
                for (int j = 0; j < N; j++) {
                    sum += A[j] * B[i + j];
                }
                max = Math.max(max, sum);
            }
            System.out.println("#" + testCase + " " + max);
        }
    }
}
