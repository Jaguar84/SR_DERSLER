package TAPSIRIQLAR;

public class Sual3 {
    public static void main(String[] args) {

        int net=method3(4,10,9);

        System.out.println("Netice="+net);
    }

    private static int method3(int a,int b,int c){

        int max=0;

        if(a>max){
            max=a;
        }

        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        return max;
    }
}
