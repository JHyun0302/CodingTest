package CodingTest.SWEA.DIFF2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW1976 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int testCase = 1; testCase <= T; testCase++) {
            int[] array = new int[4];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 4; i++) {
                array[i] = Integer.parseInt(st.nextToken());
            }

            int hour = array[0] + array[2];
            int minute = array[1] + array[3];
            if (minute >= 60) {
                minute -= 60;
                hour += 1;
            }
            if (hour >= 12) {
                hour -= 12;
            }
            System.out.println("#" + testCase + " " + hour + " " + minute);
        }
    }
}
