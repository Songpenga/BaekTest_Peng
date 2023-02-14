package Silver;//baek_24_8393

import java.util.Scanner;

public class baek_4673 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= N; i++) {
            sum += i;

        }

        System.out.println(sum);
    }
}