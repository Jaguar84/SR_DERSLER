package TAPSIRIQLAR;

import java.util.Scanner;

public class OneMonthQuestion3 {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ededleri daxil edin");

        int value=scanner.nextInt();
        int result=fintTotal(value);
        System.out.println(result);
    }

    public static int fintTotal(int value){
        int total=0;

        while (value>0){
            int rest=value%10;
            value=value/10;
            total+=rest;
        }
        return total;
    }
}
