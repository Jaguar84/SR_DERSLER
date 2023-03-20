package javaSE.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
      //  Date date=new Date();
       // System.out.println(date);
        //date.getTime();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        //String dt=simpleDateFormat.format(date);
      //  System.out.println(dt);
//        String s="11-11-2018";
//        Date D=simpleDateFormat.parse(s);
//        System.out.println(D);

        Scanner sc=new Scanner(System.in);
        System.out.println("Type your brithday");
        String dateStr= sc.nextLine();
        Date dCilent=sdf.parse(dateStr);
        Date dMdMe=sdf.parse("08-01-1993");

        Long cilent=dCilent.getTime();
        Long me=dMdMe.getTime();
        Long dif=cilent-me;

        Date diffD=new Date(dif);
        System.out.println(dif/(24*60*60*1000));
    }


}
