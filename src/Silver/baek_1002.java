package Silver;

import java.util.Scanner;

//baek_1002
public class baek_1002 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        while (count --> 0){

            //조규현
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int r1 = scanner.nextInt();

            //백승환
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int r2 = scanner.nextInt();

            System.out.println(turret(x1, y1, r1, x2, y2, r2));
        }
    }

    public static int turret(int x1, int y1, int r1, int x2, int y2, int r2){


        int distance = (int)(Math.pow(x2-x1, 2) + Math.pow(y2-y1,2)); //두 원의 거리

        if(x1 == x2 && y1 == y2 && r1 == r2){ // 두 원이 일치한다.

            return -1;
            //류재명이 있을 수 있는 위치의 개수가 무한대일 경우에는 -1을 출력한다.
        } else if (distance > Math.pow(r2+r1, 2)) {
            //두 접점 사이의 거리가 각 원의 반지름 합보다 클떄 접점이 없다.
            return 0;
        } else if (distance < Math.pow(r2-r1, 2)) {
            return 0;
        } else if (distance == Math.pow(r2-r1,2)){
            return 1; // 내접
        } else if (distance == Math.pow(r2+r1,2)){
            return 1; //외접
        }else {
            return 2;
        }
    }
}