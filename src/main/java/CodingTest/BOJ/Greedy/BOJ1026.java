package CodingTest.BOJ.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ1026 {
    static final int MAX_N = 50;
    static int n;
    static int[] a;
    static Integer[] b;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        a = new int[n];
        b = new Integer[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += a[i] * b[i];
        }

        System.out.println(ans);
    }
}
