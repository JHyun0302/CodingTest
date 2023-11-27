package CodingTest.BOJ.Math;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1010 {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int T, N, M;
    static int[][] dp = new int[30][30];

    static void input() {
        T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            N = scan.nextInt();
            M = scan.nextInt();
            sb.append(pro(M, N)).append("\n");

        }
        System.out.println(sb);
    }

    static int pro(int n, int r) {

        // 이미 풀린 경우 바로 반환
        if (dp[n][r] > 0) {
            return dp[n][r];
        }

        // 2번 성질
        if (n == r || r == 0) {
            return dp[n][r] = 1;
        }

        // 1번 성질
        return dp[n][r] = pro(n - 1, r - 1) + pro(n - 1, r);
    }

    public static void main(String[] args) {
        input();
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return str;
        }
    }
}
