package CodingTest.BOJ.Realization;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10813 {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N, M;
    static int[] arr;

    static void input() {
        N = scan.nextInt();
        M = scan.nextInt();
        arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = i;
        }
    }

    static void pro() {
        for (int i = 0; i < M; i++) {
            int changeA = scan.nextInt();
            int changeB = scan.nextInt();

            int temp = arr[changeA];
            arr[changeA] = arr[changeB];
            arr[changeB] = temp;
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(arr[i] + " ");
        }
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
