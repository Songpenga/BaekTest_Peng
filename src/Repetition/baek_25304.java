package Repetition;
//baek_25304
import java.util.Scanner;

public class baek_25304 {

    public static void main(String[] arg){
        Scanner str = new Scanner(System.in);

        int rep_total = str.nextInt(); //영수증 총 합계
        int rep_count = str.nextInt(); //  영수증 물건 종류 수

        int sum =0;
        int total =0;

        for(int i=0;i< rep_count;i++){
            int price = str.nextInt();
            int amount = str.nextInt();
            sum = price * amount;
            total += sum;
        }

        if(total == rep_total){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

}