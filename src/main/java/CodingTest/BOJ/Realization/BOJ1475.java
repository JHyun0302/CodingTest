package CodingTest.BOJ.Realization;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1475 {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();
    static String N;
    static int[] arr;

    static void input() {
        N = scan.next();
        arr = new int[10];
    }

    static void pro() {
        for (int i = 0; i < N.length(); i++) {
            int c = Character.getNumericValue(N.charAt(i));
            if (c == 9) {
                c = 6;
            }
            arr[c] += 1;
        }

        int six = arr[6] / 2;
        if (arr[6] % 2 == 1) {
            six++;
        }
        arr[6] = six;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        System.out.println(max);
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
