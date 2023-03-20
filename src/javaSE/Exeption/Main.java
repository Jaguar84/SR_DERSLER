package javaSE.Exeption;

import java.io.IOException;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws  SQLException {
        foo();
//        try {
//            int a=9;
//            int b=0;
//            System.out.println(a/b);

//            Object o=null;
//            System.out.println(o.toString());
//        }catch (ArithmeticException exception){
//            System.out.println("Aritmetic xeta");
//        }catch (NullPointerException exception){
//            System.out.println("Null xeta");
//        }catch (ArrayIndexOutOfBoundsException exception){
//            System.out.println("MAssiv xeta");
//        }catch (Exception exception){
//            System.out.println("BAsqa xeta bas verdi: "+exception.getClass().getName());
//        }
    }


    public  static void foo() throws SQLException{

        throw  new SQLException();
    }



//
//
//        public static void doIt(){
//            int a=9;
//            int b=0;
//            int result=a/b;
//
//            if(b==0){
//                int[] arr={18,31};
//               MyExeption myExeption=new MyExeption();
//               myExeption.line=arr;
//               myExeption.msg="Aritmetic exception bas verd. 0-a bolme emeliyyati olmaz!!!";
//               catch_(myExeption);
//            }
//
//        }
//
//        public  static void catch_(MyExeption ex){
//
//        }


}
