package CodingTest.BOJ.Recursive;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ17202 {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();
    static String A, B, S = "";

    static void input() {
        A = scan.next();
        B = scan.next();
        for (int i = 0; i < A.length(); i++) {
            S += A.charAt(i);
            S += B.charAt(i);
        }
    }

    static void pro() {
        while (S.length() > 2) {
            String str = "";
            for (int i = 0; i < S.length() - 1; i++) {
                int n = Character.getNumericValue(S.charAt(i)) + Character.getNumericValue(S.charAt(i + 1));
                str += Integer.toString(n % 10);
            }
            S = str;
        }
        System.out.println(S);
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
