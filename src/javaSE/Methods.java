package javaSE;

public class Methods {
    public static void main(String[] args) {
        String s=foo2("Salam");
        boolean b=foo3();
        if(b=true){
            System.out.println("S="+s);
        }

    }

    public static void foo(){
        System.out.println("Foo2is called");
    }


    public static String foo2(String s){
        System.out.println("Foo2 s="+s);
        return "Isi gordum";
    }

    public static Boolean foo3(){
        System.out.println("Foo3 is called");
        return true;
    }
}
