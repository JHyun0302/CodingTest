package CodingTest.SWEA.DIFF2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SW1984 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int testCase = 1; testCase <= T; testCase++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] array = new int[10];
            for (int i = 0; i < 10; i++) {
                array[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(array);
            int sum = 0;
            for (int i = 1; i < 9; i++) {
                sum += array[i];
            }
            System.out.println("#" + testCase + " " + Math.round(sum / 8.0));
        }
    }
}
