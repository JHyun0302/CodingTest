package CodingTest.BOJ.Realization;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 비트랑 비트마스킹 개념 https://myeongju00.tistory.com/30
 */

public class BOJ11723 {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();
    static int N;
    static String x;
    static int S;

    static void input() {
        N = scan.nextInt();
        S = 0;
    }

    static void pro() {
        for (int i = 0; i < N; i++) {
            String command = scan.next();
            if (command.equals("all")) {
                S = (1 << 21) - 1;
            } else if (command.equals("empty")) {
                S = 0;
            } else {
                int num = scan.nextInt();
                if (command.equals("add")) {
                    S |= (1 << num);
                } else if (command.equals("remove")) {
                    S &= ~(1 << num);
                } else if (command.equals("check")) {
                    sb.append((S & (1 << num)) != 0 ? 1 : 0).append("\n");
                } else if (command.equals("toggle")) {
                    S ^= (1 << num);
                }
            }
        }
        System.out.println(sb);
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
