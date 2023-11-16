package CodingTest.SWEA.DIFF2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int testCase = 1; testCase <= T; testCase++) {
            int speed = 0;
            int distance = 0;
            int N = Integer.parseInt(br.readLine());
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int command = Integer.parseInt(st.nextToken());
                if (command == 1) {
                    speed += Integer.parseInt(st.nextToken());
                } else if (command == 2) {
                    speed -= Integer.parseInt(st.nextToken());
                    if (speed < 0) {
                        speed = 0;
                    }
                }
                distance += speed;
            }
            System.out.println("#" + testCase + " " + distance);
        }
    }
}
