package CodingTest.SWEA.DIFF2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW1945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int testCase = 1; testCase <= T; testCase++) {
            int N = Integer.parseInt(br.readLine());
            int[] exponents = new int[5];
            int[] primes = {2, 3, 5, 7, 11};
            for (int i = 0; i < primes.length; i++) {
                while (N % primes[i] == 0) {
                    exponents[i]++;
                    N /= primes[i];
                }
            }
            System.out.println(
                    "#" + testCase + " " + exponents[0] + " " + exponents[1] + " " + exponents[2] + " " + exponents[3]
                            + " " + exponents[4]);
        }
    }
}
