package CodingTest.BOJ.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1459 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long x = Long.parseLong(st.nextToken());
        long y = Long.parseLong(st.nextToken());
        long w = Long.parseLong(st.nextToken()); //평행 이동
        long s = Long.parseLong(st.nextToken()); //대각선 이동

        long temp1, temp2, temp3;

        //1. 평행 이동만 하는 경우
        temp1 = (x+y) * w;

        //2. 대각선으로만 이동하는데 두 좌표의 합이 홀/짝수 인 경우
        temp2 = 0;

        if ((x + y) % 2 == 0) {
            temp2 = Math.max(x,y)* s;
        }else{
            temp2 = (Math.max(x,y) -1) * s + w;
        }

        //3. 대각선으로 갈 만큼 가고 나머지 평행 이동
        temp3 = (Math.min(x,y)) * s + (Math.abs(x-y)) * w;

        System.out.println(Math.min(temp1, Math.min(temp2, temp3)));
    }
}
