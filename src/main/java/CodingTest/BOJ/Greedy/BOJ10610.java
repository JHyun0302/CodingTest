package CodingTest.BOJ.Greedy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ10610 {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();
    static String N;

    static void input() {
        N = scan.next();
    }

    static void pro() {
        int total = 0;
        for (int i = 0; i < N.length(); i++) {
            total += N.charAt(i);
        }

        if (!N.contains("0") || total % 3 != 0) {
            System.out.println("-1");
            return;
        }

        char[] array = N.toCharArray();
        Arrays.sort(array);

        for (int i = array.length - 1; i >= 0; i--) {
            sb.append(array[i]);
        }
        System.out.println(sb.toString());
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
