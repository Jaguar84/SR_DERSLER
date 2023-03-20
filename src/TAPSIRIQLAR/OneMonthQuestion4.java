package TAPSIRIQLAR;

import java.util.Scanner;

public class OneMonthQuestion4 {
    public static void main(String[] args) {
//        int a=5;
//        int b=3;
//
//        a=a+b;
//
//        b=a-b;
//        a=a-b;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Ededleri daxil edin");

        int value=scanner.nextInt();
        int result=faktorial(value);
        System.out.println(result);

    }

    public static  int faktorial(int n){
        if(n==0){
            return 1;
        }else{
            return (n * faktorial(n-1));
        }
    }
}
