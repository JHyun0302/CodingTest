package CodingTest.SWEA.DIFF2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW1926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            String number = String.valueOf(i);
            if (number.contains("3") || number.contains("6") || number.contains("9")) {
                number = number.replace("3", "-").replace("6", "-").replace("9", "-");
                number = number.replace("0", "").replace("1", "").replace("2", "")
                        .replace("4", "").replace("5", "").replace("7", "").replace("8", "");
            }
            System.out.print(number + " ");
        }
    }
}
