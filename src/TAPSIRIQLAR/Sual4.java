package TAPSIRIQLAR;

import java.util.Scanner;

public class Sual4 {
    public static void main(String[] args) {
        isebasla();
    }

    private static void isebasla(){
        int[] arr=arrayiDoldur();
        int netice=arrayiTopla(arr);
        if(netice>10){
            isebasla();
        }
        arrayiCapet(arr);
    }

    private static  void arrayiCapet(int[] arr){
            for(int i=0; i<arr.length; i++){
                System.out.println(arr[i]);
            }
    }

    public  static  int[] arrayiDoldur(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Massivin uzunlugunu daxil et");
        int arrLength=scanner.nextInt();

        int[] arr=new int[arrLength];

        for(int i=0; i<arrLength; i++ ){
            System.out.println("Ededi daxil edin");
            arr[i]= scanner.nextInt();
        }
        return arr;
       }

    public static int arrayiTopla(int[] arr) {
        int netice=0;
        for(int i=0; i< arr.length; i++){
            netice+=arr[i];
        }
        return netice;
    }

}
