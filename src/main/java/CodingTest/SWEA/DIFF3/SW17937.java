package CodingTest.SWEA.DIFF3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class SW17937 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            BigInteger A = new BigInteger(st.nextToken());
            BigInteger B = new BigInteger(st.nextToken());

            if (A.equals(B)) {
                System.out.println("#" + tc + " " + A);
            } else {
                System.out.println("#" + tc + " 1");
            }
        }
    }
}
