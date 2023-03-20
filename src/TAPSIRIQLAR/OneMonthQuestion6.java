package TAPSIRIQLAR;

import java.util.Scanner;

public class OneMonthQuestion6 {
    public static void main(String[] args) {
        int[] arr = arrayiDoldur();
        String cavab;
        if(chekArray(arr)){
            cavab="Berabedir";
        }else{
            cavab="Berabedir deyil";
        }
        System.out.println("Netice: "+cavab);
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

    public static boolean chekArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i!=j) {
                    return true;
                }
            }
        }
        return false;
    }
}
