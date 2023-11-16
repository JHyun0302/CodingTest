package CodingTest.SWEA.DIFF2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Base64;

public class SW1928 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int testCase = 1; testCase <= T; testCase++) {
            String encoding = br.readLine();
            byte[] decodedBytes = Base64.getDecoder().decode(encoding);
            String decoded = new String(decodedBytes);
            System.out.println("#" + testCase + " " + decoded);
        }
    }
}
