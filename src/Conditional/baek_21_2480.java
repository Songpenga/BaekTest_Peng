package Conditional;//Conditional.baek_21_2480

import java.util.Scanner;

public class baek_21_2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        scanner.close();

        if(A == B && A == C){
            System.out.println(10000+A*1000);
        }else if(A == B || A == C){
            System.out.println(1000+A*100);
        }else if(B == C){
            System.out.println(1000+B*100);
        }else{
            if (A > B && A > C){
                System.out.println(A*100);
            } else if (B > A && B > C){
                System.out.println(B*100);
            } else {
                System.out.println(C*100);
            }
        }
    }
}

