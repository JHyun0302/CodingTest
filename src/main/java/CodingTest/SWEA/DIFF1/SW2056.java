package CodingTest.SWEA.DIFF1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW2056 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int t = 1; t <= T; t++) {
            String date = br.readLine();
            int year = Integer.parseInt(date.substring(0, 4));
            int month = Integer.parseInt(date.substring(4, 6));
            int day = Integer.parseInt(date.substring(6, 8));

            boolean isValid = month >= 1 && month <= 12 && day >= 1 && day <= daysInMonth[month];

            System.out.println("#" + t + " " + (isValid ? String.format("%04d/%02d/%02d", year, month, day) : -1));
        }
    }
}
