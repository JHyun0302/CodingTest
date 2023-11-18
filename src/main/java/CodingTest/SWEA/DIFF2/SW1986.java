package CodingTest.SWEA.DIFF2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW1986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int testCase = 1; testCase <= T; testCase++) {
            int N = Integer.parseInt(br.readLine());
            int ans = 0;
            for (int i = 1; i <= N; i++) {
                if (i % 2 != 0) {
                    ans += i;
                } else {
                    ans -= i;
                }
            }
            System.out.println("#" + testCase + " " + ans);
        }
    }
}
