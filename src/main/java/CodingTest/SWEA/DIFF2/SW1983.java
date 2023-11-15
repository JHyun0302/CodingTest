package CodingTest.SWEA.DIFF2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW1983 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] grades = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};

        for (int testCase = 1; testCase <= T; testCase++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int[][] students = new int[N][2];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                int middleExam = Integer.parseInt(st.nextToken());
                int finalExam = Integer.parseInt(st.nextToken());
                int homework = Integer.parseInt(st.nextToken());

                int total = (middleExam * 35) + (finalExam * 45) + (homework * 20);
                students[i][0] = i;
                students[i][1] = total;
            }

            for (int i = 0; i < N - 1; i++) {
                for (int j = 0; j < N - i - 1; j++) {
                    if (students[j][1] < students[j + 1][1]) {
                        int[] temp = students[j];
                        students[j] = students[j + 1];
                        students[j + 1] = temp;
                    }
                }
            }

            for (int i = 0; i < N; i++) {
                if (students[i][0] == K - 1) {
                    System.out.println("#" + testCase + " " + grades[i / (N / 10)]);
                    break;
                }
            }
        }
    }
}