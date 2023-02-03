import java.util.Scanner;

//baek_17_2753
public class baek_17_2753 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        scanner.close();

        if (A % 4 == 0 && A % 100 != 0){
            System.out.println("1");
        } else if (A % 400 == 0)        {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}

