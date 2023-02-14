package Repetition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//baek_11021
public class baek_11021 {

    public static void main(String[] args) throws IOException {
        BufferedReader Buffer = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(Buffer.readLine());
        StringBuilder strb = new StringBuilder();
        for (int i = 1; i < t; i++) {
            StringTokenizer st = new StringTokenizer(Buffer.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            strb.append("Case #" + i + ": " + (a+b) + "\n");
        }
        System.out.print(strb);
    }
}