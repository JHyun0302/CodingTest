package CodingTest.SWEA.DIFF1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW2072 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int oddSum = 0;
            for (int j = 0; j < 10; j++) {
                int number = Integer.parseInt(st.nextToken());
                if (number % 2 == 1) {
                    oddSum += number;
                }
            }
            System.out.println("#" + i + " " + oddSum);
        }
    }
}