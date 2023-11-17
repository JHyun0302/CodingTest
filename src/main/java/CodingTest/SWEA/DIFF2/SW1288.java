package CodingTest.SWEA.DIFF2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW1288 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            boolean[] check = new boolean[10];
            int count = 0;

            for (int i = 1; ; i++) {
                int num = i * N;
                while (num > 0) {
                    check[num % 10] = true;
                    num /= 10;
                }

                boolean allSean = true;
                for (boolean sean : check) {
                    if (!sean) {
                        allSean = false;
                        break;
                    }
                }
                if (allSean) {
                    count = i * N;
                    break;
                }
            }
            System.out.println("#" + tc + " " + count);
        }
    }
}

