package CodingTest.BOJ.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1049 {
    static int n, m;
    static int[] six;
    static int[] one;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        six = new int[m];
        one = new int[m];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            six[i] = Integer.parseInt(st.nextToken());
            one[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(six);
        Arrays.sort(one);

        int minCost = Integer.MAX_VALUE;

        // 1. 패키지로만 구매하는 경우
        minCost = Math.min(minCost, ((n / 6) + 1) * six[0]);

        // 2. 낱개로만 구매하는 경우
        minCost = Math.min(minCost, n * one[0]);

        // 3. 패키지와 낱개를 혼합 구매하는 경우
        minCost = Math.min(minCost, (n / 6) * six[0] + (n % 6) * one[0]);

        System.out.println(minCost);
    }
}
