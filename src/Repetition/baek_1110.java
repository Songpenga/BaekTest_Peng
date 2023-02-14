package Repetition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Repetition.baek_1110
public class baek_1110 {

    public static void main(String[] args) throws IOException {
        BufferedReader  Buffer = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt( Buffer.readLine());
        if (num == 0) {
            System.out.print(1);
            return;
        }
        int ans = num;
        int comNum = 0;
        int count = 0;
        while (comNum != num) {
            comNum = ans;
            count++;
            if (num < 10) {
                num = num*10 + num;
            } else {
                num = (num%10)*10 + ((num%10)+(num/10))%10;
            }
        }

        System.out.print(count);
    }
}