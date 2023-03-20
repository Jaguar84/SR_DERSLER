package javaSE.lesson;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
//        int [] arr={1,3,2,4,12};
//        int elem=arr[4];
//        System.out.println(elem);

        // Bir sirali massiv
//        int arr[]=new int[5];
//
//        System.out.println("Daxil edilme");
//        for(int i=0; i<arr.length; i++){
//            Scanner scanner=new Scanner(System.in);
//            System.out.println(i+".Ededi daxil edin:");
//            arr[i]=scanner.nextInt();
//        }
//
//        System.out.println("Cap edilme");
//        for (int i=0; i<arr.length; i++){
//            System.out.println(i+"."+arr[i]);
//        }



        // Iki sirali bes sutunlu massiv

//        int arr[][] =new int[2][5];
//
//        System.out.println(arr.length);
//        System.out.println(arr[1].length);
//        System.out.println("Daxil edilme");
//
//        for(int i=0; i<arr.length; i++){
//            for (int j=0; j<arr[i].length; j++){
//            Scanner scanner=new Scanner(System.in);
//            System.out.println(i+"."+j+".Ededi daxil edin:");
//            arr[i][j]=scanner.nextInt();
//            }
//        }
//
//        System.out.println("Cap edilme");
//        for (int i=0; i<arr.length; i++){
//            for (int j=0; j<arr[i].length; j++) {
//                System.out.print(i + "." +j+"." + arr[i][j]+", ");
//            }
//            System.out.println(" ");
//        }


        String s="    Salam   necesen    ne     var    ne    yox";

        String[] mass=s.split(" ");

        String netice="";

        for (int i=0;  i<mass.length; i++){

            String elem=mass[i];

            if(!elem.isEmpty()){
                netice+=elem+" ";
            }
          }
        netice=netice.trim();
        System.out.println("netice="+netice);
    }
}
