package Foundation;

import java.util.Scanner;

public class baek_8_18108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int y = scanner.nextInt();

        if( y < 1000 || y > 3000){
            System.out.println("범위 값을 초과합니다.");

        } else {
            System.out.println(y-543);
        }
    }
}
