package TAPSIRIQLAR;

import java.util.Scanner;

public class OneMonthQuestion7 {
    public static void main(String[] args) {
        int[] arr=arrayiDoldur();

        System.out.println("Netice: "+checkArrayIncrement(arr));

    }

    public static int[] arrayiDoldur() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Massivin uzunlugun yaz:");
        int arrLength = scanner.nextInt();
        int[] arr = new int[arrLength];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Ededi daxil edin:");
            arr[i] = scanner.nextInt();
        }

        return arr;
    }


    public static  boolean checkArrayIncrement(int[] arr){
        boolean res=true;

        for (int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                res=false;
            }

        }
        return res;
    }
}
