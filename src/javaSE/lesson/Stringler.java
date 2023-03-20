package javaSE.lesson;

import java.util.Scanner;

public class Stringler {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Metni daxil edin:");
//        String metn=scanner.nextLine();

        String metn="Java Language";
        int uzunluq=metn.length(); // uzunluqu tapmaq
        System.out.println("uzunlugu"+uzunluq);

        char c=metn.charAt(3); // carakteri tapmaq
       System.out.println("Karakter="+c);

        char c2=metn.charAt(uzunluq-1); // sonuncu karakteri tapmaq
       System.out.println("Sonuncu karakter="+c2);


       String substring= metn.substring(1,3);
       System.out.println("Substring="+substring);

       boolean b= metn.contains("Lan");
        System.out.println("Contanis="+b);

       boolean b2= metn.equals("Java2 Language");
        System.out.println("equals="+b2);

       boolean b3= metn.isEmpty();
        System.out.println("Is empty="+b3);
    }
}
