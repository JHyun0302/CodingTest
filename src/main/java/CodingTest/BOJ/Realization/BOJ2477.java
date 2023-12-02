package CodingTest.BOJ.Realization;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2477 {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();
    static int K;
    static int arr[];

    static int maxWidth, maxWidthIdx, maxHeight, maxHeightIdx, news = 0;

    static void input() {
        K = scan.nextInt();
        arr = new int[6];

    }

    static void pro() {
        for (int i = 0; i < 6; i++) {
            news = scan.nextInt();
            arr[i] = scan.nextInt();

            if ((news == 1 || news == 2) && maxWidth < arr[i]) {
                maxWidth = arr[i];
                maxWidthIdx = i;
            } else if ((news == 3 || news == 4) && maxHeight < arr[i]) {
                maxHeight = arr[i];
                maxHeightIdx = i;
            }
        }

        int left, right, minWidth, minHeight;

        if (maxWidthIdx + 1 == 6) {
            right = 0;
        } else {
            right = maxWidthIdx + 1;
        }

        if (maxWidthIdx - 1 == -1) {
            left = 5;
        } else {
            left = maxWidthIdx - 1;
        }
        // 빈 사각형 세로 길이
        minHeight = Math.abs(arr[right] - arr[left]);

        if (maxHeightIdx + 1 == 6) {
            right = 0;
        } else {
            right = maxHeightIdx + 1;
        }

        if (maxHeightIdx - 1 == -1) {
            left = 5;
        } else {
            left = maxHeightIdx - 1;
        }
        // 빈 사각형 가로 길이
        minWidth = Math.abs(arr[right] - arr[left]);

        System.out.println(((maxWidth * maxHeight) - (minHeight * minWidth)) * K);
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
