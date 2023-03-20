package javaSE;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("A ededi daxil edin:");
        double a=scanner.nextDouble();

        System.out.println("B ededi daxil edin:");
        double b=scanner.nextDouble();

        System.out.println("Operationu daxil edin:");
        int operation=scanner.nextInt();
        double result=0;
//        if(operation==1){
//           result= MathUtil.topla(a,b);
//        }else if(operation==2){
//            result=MathUtil.cix(a,b);
//        }else if(operation==3){
//            result=MathUtil.vur(a,b);
//
//        }else if(operation==4){
//            result=MathUtil.bol(a,b);
//        }else{
//            System.out.println("Operation is not valid");
//        }
//
//        System.out.println("Result="+result);

        switch (operation){
            case 1:
                result=MathUtil.topla(a,b);
                break;
            case 2:
                result=MathUtil.cix(a,b);
                break;
            case 3:
                result=MathUtil.vur(a,b);
                break;
            case 4:
                result=MathUtil.bol(a,b);
                break;
            default:
                result=-1;
        }
        System.out.println("Result="+result);
    }


}
