package Foundation;

import java.util.Scanner;

public class baek_7_10926 {
    public static void main(String[] args) {
/*첫째 줄에 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어진다.
아이디는 알파벳 소문자로만 이루어져 있으며, 길이는 50자를 넘지 않는다.
놀람은 아이디 뒤에 ??!를 붙여서 나타낸다.*/

        Scanner scanner = new Scanner(System.in);

        int length = 50;
        String Id = scanner.nextLine();

        Id = Id.toLowerCase();
        if (Id.length() > 50) {
            System.out.println("입력값을 초과 했습니다.");
        } else {
            System.out.println(Id + "??!");
        }
    }
}
