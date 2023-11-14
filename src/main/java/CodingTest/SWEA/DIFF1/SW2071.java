package CodingTest.SWEA.DIFF1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW2071 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int testCase = 1; testCase <= T; testCase++) {
            int avg = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] array = new int[10];
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(st.nextToken());
            }
            for (int i = 0; i < array.length; i++) {
                avg += array[i];
            }
            System.out.println("#" + testCase + " " + Math.round(avg / 10.0));
        }
    }
}
