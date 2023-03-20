package TAPSIRIQLAR;

public class Sual2 {
    public static void main(String[] args) {
        int a=4;
        int net=method(a);
        if(net>5){
            System.out.println("Nese bir sey edecem");
        }
        System.out.println("Netice="+net);
    }



        private static int method(int a){
            return a==0?0:(a>0? 1:-1);
        }
}