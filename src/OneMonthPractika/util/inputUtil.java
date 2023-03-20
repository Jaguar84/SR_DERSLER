package OneMonthPractika.util;

import java.util.Scanner;

public class inputUtil {


    public  static String requireText(String title){

       Scanner scanner=new Scanner(System.in);
        System.out.println(title);
        String answer=scanner.nextLine();
        return answer;
    }

    public  static int requireNumber(String title){
        Scanner scanner=new Scanner(System.in);
        System.out.println(title);
        int answer=scanner.nextInt();
        return answer;
    }
}
