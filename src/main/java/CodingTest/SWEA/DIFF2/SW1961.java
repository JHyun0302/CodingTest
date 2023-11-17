package CodingTest.SWEA.DIFF2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW1961 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int testCase = 1; testCase <= T; testCase++) {
            int N = Integer.parseInt(br.readLine());
            int[][] array = new int[N][N];

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    array[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            System.out.println("#" + testCase);
            for (int i = 0; i < N; i++) {
                for (int j = N - 1; j >= 0; j--) {
                    System.out.print(array[j][i]);
                }
                System.out.print(" ");
                for (int j = N - 1; j >= 0; j--) {
                    System.out.print(array[N - 1 - i][j]); // 180 degrees rotation
                }
                System.out.print(" ");
                for (int j = 0; j < N; j++) {
                    System.out.print(array[j][N - 1 - i]); // 270 degrees rotation
                }
                System.out.println();
            }
        }
    }
}