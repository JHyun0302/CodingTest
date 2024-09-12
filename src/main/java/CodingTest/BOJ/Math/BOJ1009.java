package CodingTest.BOJ.Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1009 {
    static int testCase, a, b;
    static int ans;

    static int func() {
        ans = 1;
        for (int j = 0; j < b; j++) {
            ans *= a;
            ans %= 10;
        }
        if (ans == 0) {
            return 10;
        } else {
            return ans;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        testCase = Integer.parseInt(st.nextToken());

        while (testCase-- > 0) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            System.out.println(func());
        }
    }
}
