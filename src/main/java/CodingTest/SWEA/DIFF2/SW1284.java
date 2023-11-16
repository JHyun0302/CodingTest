package CodingTest.SWEA.DIFF2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW1284 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());
            int Q = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int companyA = P * W;
            int companyB = 0;
            if (W - R < 0) {
                companyB = Q;
            } else {
                companyB = Q + (W - R) * S;
            }

            if (companyA > companyB) {
                System.out.println("#" + i + " " + companyB);
            } else {
                System.out.println("#" + i + " " + companyA);
            }
        }
    }
}
