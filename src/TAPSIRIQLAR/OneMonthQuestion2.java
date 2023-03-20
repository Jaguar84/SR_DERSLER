package TAPSIRIQLAR;

import java.util.Scanner;

public class OneMonthQuestion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Daxil et:");
        String melumat = scanner.nextLine();
       System.out.println(TersineCevir(melumat));
    }
    public static String TersineCevir(String value) {

        int arrayLengt = value.length() - 1;
        String netice = "";
        String cavab;
        for (int i = arrayLengt; i >= 0; i--) {
            netice += value.charAt(i);

        }
        if (value.equals(netice)) {
            cavab = "Beraberdir";
        } else {
            cavab = "Beraber deyil";
        }
        return cavab;
    }
}
