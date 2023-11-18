package CodingTest.SWEA.DIFF2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW1974 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int[][] array = new int[9][9];
            for (int i = 0; i < 9; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 9; j++) {
                    array[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            if (checkSudoku(array)) {
                System.out.println("#" + tc + " " + 1);
            } else {
                System.out.println("#" + tc + " " + 0);
            }
        }
    }

    private static boolean checkSudoku(int[][] array) {
        for (int i = 0; i < 9; i++) {
            boolean[] checkRow = new boolean[10];
            boolean[] checkCol = new boolean[10];
            for (int j = 0; j < 9; j++) {
                if (checkRow[array[i][j]] || checkCol[array[j][i]]) {
                    return false;
                }
                checkRow[array[i][j]] = true;
                checkCol[array[j][i]] = true;
            }
        }

        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                boolean[] checkBlock = new boolean[10];
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (checkBlock[array[i + k][j + l]]) {
                            return false;
                        }
                        checkBlock[array[i + k][j + l]] = true;
                    }
                }
            }
        }

        return true;
    }
}
