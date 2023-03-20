package TAPSIRIQLAR;

public class Sual1 {

    public static void main(String[] args) {
        Bean bean=new Bean();
        bean.b=4;
        method2(bean);
        System.out.println(bean.b);

//        int netice=method(4);
//        System.out.println("netice="+netice);
    }

    public static  void method2(Bean alma){
        alma.b++;
    }

    private static  int method(int a){
        return a==0? 0:(a>0? 0:-1);
//        if(a==0){
//            return 0;
//        }else if(a>0){
//            return 1;
//        }else{
//            return -1;
//        }

    }
}
