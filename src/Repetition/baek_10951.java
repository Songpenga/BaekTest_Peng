package Repetition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//Repetition.baek_10951
public class baek_10951 {

    public static void main(String[] args) throws IOException {
        BufferedReader Buffer = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strb = new StringBuilder();
        String str;
        while ((str = Buffer.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            strb.append(a+b + "\n");
        }
        System.out.print(strb);
    }
}