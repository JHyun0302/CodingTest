package CodingTest.SWEA.DIFF2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW1204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int testCase = Integer.parseInt(br.readLine());
            int[] scores = new int[101];
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for (int i = 0; i < 1000; i++) {
                int score = Integer.parseInt(st.nextToken());
                scores[score]++;
            }

            int maxFrequency = 0;
            int mode = 0;
            for (int i = 100; i >= 0; i--) {
                if (scores[i] >= maxFrequency) {
                    maxFrequency = scores[i];
                    mode = i;
                }
            }

            System.out.println("#" + testCase + " " + mode);
        }
    }
}
