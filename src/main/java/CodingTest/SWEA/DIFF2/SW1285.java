package CodingTest.SWEA.DIFF2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW1285 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            int count = 0;
            int min = Integer.MAX_VALUE;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                int distance = Math.abs(Integer.parseInt(st.nextToken()));
                if (distance < min) {
                    min = distance;
                    count = 1;
                } else if (distance == min) {
                    count++;
                }
            }
            System.out.println("#" + tc + " " + min + " " + count);
        }
    }
}
