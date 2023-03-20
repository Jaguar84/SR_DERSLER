package TAPSIRIQLAR;

public class OneMonthQuestion8 {
    public static void main(String[] args) {
    Method(4,'a',false);
    }

    private static void Method(int printCount, char sybol, boolean underUnder){
        for(int i=0; i<printCount; i++){
            if(underUnder){
                System.out.println(sybol);
            }else{
                System.out.print(sybol+" ");
            }
        }
    }
}
