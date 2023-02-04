package Conditional;//Conditional.baek_20_2525

import java.util.Scanner;

public class baek_20_2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        int C = scanner.nextInt();
        scanner.close();

        if (H <= 23 && M <= 59 && C <= 1000) {
            if ( M + C >= 60){
                System.out.println((H+((M+C)/60))%24);
                System.out.println((M+C)%60);
            } else {
                System.out.println(H);
                System.out.println(M+C);
            }
        }
    }
}

