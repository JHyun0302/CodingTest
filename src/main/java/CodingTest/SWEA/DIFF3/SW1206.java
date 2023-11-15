package CodingTest.SWEA.DIFF3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW1206 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int testCase = 1; testCase <= 10; testCase++) {
            int N = Integer.parseInt(br.readLine());
            int[] buildings = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < N; i++) {
                buildings[i] = Integer.parseInt(st.nextToken());
            }
            int ans = 0;

            for (int i = 2; i < N - 2; i++) {
                int leftMax = Math.max(buildings[i - 2], buildings[i - 1]);
                int rightMax = Math.max(buildings[i + 1], buildings[i + 2]);
                int aroundMax = Math.max(leftMax, rightMax);

                if (buildings[i] > aroundMax) {
                    ans += buildings[i] - aroundMax;
                }
            }

            System.out.println("#" + testCase + " " + ans);
        }
    }
}
