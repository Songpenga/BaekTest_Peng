package Foundation;

import java.util.Scanner;

public class baek_11_2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        String B = scanner.next();
        int check_B = 0;

        scanner.close();

        check_B = B.length();

            for (int i = check_B-1; i > -1 ; i--) {

                System.out.println(A*(Integer.parseInt(String.valueOf(B.charAt(i)))));

            }
                System.out.println(A * Integer.parseInt(B));
        }
    }

