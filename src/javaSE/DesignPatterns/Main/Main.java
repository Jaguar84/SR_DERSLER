package javaSE.DesignPatterns.Main;


import javaSE.DesignPatterns.Bean.Fanar;
import javaSE.DesignPatterns.Bean.Fanar.FanarBuilder;
public class Main {
    public static void main(String[] args) {
       FanarBuilder builder=new Fanar.FanarBuilder()
       .whatIsYourName("NUsret")
       .whatIsYourFatherName("Qudret")
       .HowOldAreYou(25);

        Fanar f=builder.build();

        System.out.println(f.getName());

        builder.whatIsYourName("Fikret");
        System.out.println(f.getName());
    }

    public  static void writeToFile(Fanar s){

    }
}
