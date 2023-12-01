package CodingTest.BOJ.Recursive;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ24416 {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();
    static int n;
    static int count1, count2 = 0;
    static int f[];

    static void input() {
        n = scan.nextInt();
    }

    static void pro() {
        fib(n);
        f = new int[n + 1];
        fibonacci(n);
        System.out.println(count1 + " " + count2);
    }

    public static void main(String[] args) {
        input();
        pro();
    }

    public static int fib(int n) {
        if (n == 1 || n == 2) {
            count1++;
            return 1;
        } else {
            return (fib(n - 1) + fib(n - 2));
        }
    }

    public static int fibonacci(int n) {
        if (f[1] == 1 || f[2] == 1) {
            return 1;
        }
        for (int i = 3; i <= n; i++) {
            count2++;
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
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
