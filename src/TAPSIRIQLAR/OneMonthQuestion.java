package TAPSIRIQLAR;

import java.util.Scanner;

public class OneMonthQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Daxil et:");
        int eded = scanner.nextInt();

        System.out.println("Lesson1: "+method(eded));

    }



    private static int method(int a){
        return a==0 ? 0:(a>0?1:-1);
      /*  if(a==0){
            return 0;
        }else if(a>0){
            return 1;
        }else{
            return -1;
        }*/
    }
}
