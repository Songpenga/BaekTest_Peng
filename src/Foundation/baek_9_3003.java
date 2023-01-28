package Foundation;

import java.util.Scanner;

public class baek_9_3003 {
    public static void main(String[] args) {
     /*
        King, Queen = 1;
        Rook, Bishop, Knight = 2;
        Pawn = 8;
      */
        Scanner scanner = new Scanner(System.in);

        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] white = new int[6];
        int Array = 0;

        for (int i = 0; i < chess.length; i++) {
            Array = scanner.nextInt();
            white[i] = Array;
        }

        for (int i = 0; i < chess.length; i++) {
            System.out.println(chess[i] - white[i]);
        }
        scanner.close();


    }
}
