//baek_19_2884

import java.util.Scanner;

public class baek_19_2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.close();

        if (H <= 23 && M <= 59) {
            if ( M >= 45){
                System.out.println(H);
                System.out.println(M-45);
            } else if ( H == 0) {
                System.out.println( "23");
                System.out.println(M+60-45);
            }
            else {
                System.out.println(H-1);
                System.out.println(M+60-45);
            }
        }
    }
}

