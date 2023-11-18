package CodingTest.SWEA.DIFF2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW1970 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int testCase = 1; testCase <= T; testCase++) {
            int N = Integer.parseInt(br.readLine());
            int array[] = new int[8];

            if (N >= 50000) {
                array[0] = N / 50000;
                N %= 50000;
            }
            if (N >= 10000) {
                array[1] = N / 10000;
                N %= 10000;
            }
            if (N >= 5000) {
                array[2] = N / 5000;
                N %= 5000;
            }
            if (N >= 1000) {
                array[3] = N / 1000;
                N %= 1000;
            }
            if (N >= 500) {
                array[4] = N / 500;
                N %= 500;
            }
            if (N >= 100) {
                array[5] = N / 100;
                N %= 100;
            }
            if (N >= 50) {
                array[6] = N / 50;
                N %= 50;
            }
            if (N >= 10) {
                array[7] = N / 10;
                N %= 10;
            }
            System.out.println("#" + testCase);
            for (int money : array) {
                System.out.print(money + " ");
            }
            System.out.println();
        }
    }
}