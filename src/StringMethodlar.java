import java.util.Locale;
import java.util.Scanner;

public class StringMethodlar {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir soz daxil edin");
        String  s=sc.nextLine();

        int i= s.length();
        System.out.println(i);

        char c=s.charAt(s.length()-1);
        System.out.println(c);


        String sbstrings=s.substring(1,3);
        System.out.println(sbstrings);

        boolean contain=s.contains("us");
        System.out.println(contain);

        boolean equal=s.equals("Nusret");
        System.out.println(equal);

        boolean startswidth=s.startsWith("Nus");
        System.out.println(startswidth);

        boolean startend=s.endsWith("et");
        System.out.println(startend);

        String ss=s.trim();
        System.out.println(ss);

        String lover=s.toLowerCase();
        System.out.println(lover);

        String upper=s.toUpperCase();
        System.out.println(upper);

        int indexof=s.indexOf("NUsr");
        System.out.println(indexof);

        int lastindex=s.lastIndexOf("a");
        System.out.println(lastindex);

        String replace=s.replace("Nus","Fik");
        System.out.println(replace);

    }
}
