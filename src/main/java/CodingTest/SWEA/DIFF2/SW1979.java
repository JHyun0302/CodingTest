package CodingTest.SWEA.DIFF2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW1979 {
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int testCase = 1; testCase <= T; testCase++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            map = new int[N][N];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int count = 0;
            for (int i = 0; i < N; i++) {
                int row = 0;
                int column = 0;
                for (int j = 0; j < N; j++) {
                    row = (map[i][j] == 1) ? row + 1 : 0;
                    column = (map[i][j] == 1) ? column + 1 : 0;
                    if (row == K && (j == N - 1 || map[i][j + 1] == 0)) {
                        count++;
                    }
                    if (column == K && (j == N - 1 || map[j + 1][i] == 0)) {
                        count++;
                    }
                }
            }

            System.out.println("#" + testCase + " " + count);
        }
    }
}
