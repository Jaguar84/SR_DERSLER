package javaSE.lesson5;

public class User {
    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Nonestatic block");
    }

}
