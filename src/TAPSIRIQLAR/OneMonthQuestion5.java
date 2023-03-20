package TAPSIRIQLAR;

import java.util.Scanner;

public class OneMonthQuestion5 {
    public static void main(String[] args) {
        iseBasla();
    }

    public static void iseBasla() {
        System.out.println("Ise bashladiq");
        int[] arr=arrayiDoldur();
        int netice=arrayiTopla(arr);
        if(netice>10){
            iseBasla();
        }else{
            arrayiCapet(arr);
        }

    }
    public static void arrayiCapet( int[] arr) {
        System.out.println("Array cap");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }


    public static int[] arrayiDoldur() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Massivin uzunlugun yaz:");
        int arrLength=scanner.nextInt();
        int[] arr=new int[arrLength];

        for(int i=0; i<arr.length; i++){
            System.out.println("Ededi daxil edin:");
           arr[i]=scanner.nextInt();
        }

    return arr;
    }

    public static int arrayiTopla(int[] arr) {
            int netice=0;
            for(int i=0; i<arr.length; i++){
                netice+=arr[i];
            }
            return netice;
    }
}
