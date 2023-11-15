package CodingTest.SWEA.DIFF2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백만 장자 프로젝트
public class SW1859 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long T = Long.parseLong(br.readLine());

        for (long i = 1; i <= T; i++) {
            long money = 0;
            int N = Integer.parseInt(br.readLine());
            long[] price = new long[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                price[j] = Long.parseLong(st.nextToken());
            }
            long maxPrice = price[N - 1];
            for (int k = N - 2; k >= 0; k--) {
                if (price[k] > maxPrice) {
                    maxPrice = price[k];
                } else {
                    money += maxPrice - price[k];
                }
            }
            System.out.println("#" + i + " " + money);
        }
    }
}
