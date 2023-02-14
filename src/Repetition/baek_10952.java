package Repetition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//Repetition.baek_10952
public class baek_10952 {

    public static void main(String[] args) throws IOException {
        BufferedReader Buffer = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(Buffer.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0) break;  //0이 2개가 들어오면 입력 종료
            strb.append(a+b + "\n");
        }
        System.out.print(strb);
    }
}