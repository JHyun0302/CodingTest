package CodingTest.BOJ.Greedy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1946 {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();
    static int T;
    static int N;
    static int[] arr;

    static void input() {
        T = scan.nextInt();
        while (T-- > 0) {
            N = scan.nextInt();
            arr = new int[N + 1];

            for (int j = 0; j < N; j++) {
                int start = scan.nextInt(); //서류
                int end = scan.nextInt(); //면접
                arr[start] = end;
            }

            int result = 1;
            int standard = arr[1];
            for (int i = 2; i <= N; i++) {
                if (standard > arr[i]) {
                    result++;
                    standard = arr[i];
                }
            }
            System.out.println(result);
        }
    }

    static void pro() {

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
