package Repetition;//baek_10950

import java.util.Scanner;

public class baek_10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        int A, B;

        for (int i = 1; i<=T; i++) {
        A = scanner.nextInt();
        B = scanner.nextInt();

        System.out.println(A+B);
        }

        scanner.close();
    }
}