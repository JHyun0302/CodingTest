package CodingTest.SWEA.DIFF1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW2050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String alphabet = br.readLine();

        for (char c : alphabet.toCharArray()) {
            System.out.print(c - 64 + " ");
        }
    }
}
