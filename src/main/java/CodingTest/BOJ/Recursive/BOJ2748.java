package CodingTest.BOJ.Recursive;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2748 {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();
    static int n;
    static long[] memo;

    static void input() {
        n = scan.nextInt();
        memo = new long[n + 1];
        for (int i = 0; i < n + 1; i++) {
            memo[i] = -1;
        }
        memo[0] = 0;
        memo[1] = 1;
    }

    static void pro() {
        System.out.println(fibo(n));
    }

    public static long fibo(int n) {
        if (memo[n] == -1) {
            memo[n] = fibo(n - 1) + fibo(n - 2);
        }
        return memo[n];
    }

    public static void main(String[] args) {
        input();
        pro();
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
