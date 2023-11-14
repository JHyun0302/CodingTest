package CodingTest.SWEA.DIFF2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW1954 {
    static int[][] map;
    static boolean[][] visit;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int N, num = 1, dir = 0;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int testCase = 1; testCase <= T; testCase++) {
            N = Integer.parseInt(br.readLine());
            map = new int[N][N];
            visit = new boolean[N][N];
            num = 1;
            dir = 0;
            dfs(0, 0);

            System.out.println("#" + testCase);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void dfs(int x, int y) {
        visit[x][y] = true;
        map[x][y] = num++;
        int nx = x + dx[dir];
        int ny = y + dy[dir];
        if (nx >= 0 && ny >= 0 && nx < N && ny < N && !visit[nx][ny]) {
            dfs(nx, ny);
        } else {
            dir = (dir + 1) % 4;
            nx = x + dx[dir];
            ny = y + dy[dir];
            if (nx >= 0 && ny >= 0 && nx < N && ny < N && !visit[nx][ny]) {
                dfs(nx, ny);
            }
        }
    }
}
