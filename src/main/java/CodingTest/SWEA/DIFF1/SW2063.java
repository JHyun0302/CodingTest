package CodingTest.SWEA.DIFF1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class SW2063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> array = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(st.nextToken());
            array.add(number);
        }
        Collections.sort(array);

        System.out.println(array.get(N / 2));
    }
}
