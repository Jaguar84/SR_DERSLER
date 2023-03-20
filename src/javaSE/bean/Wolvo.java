package javaSE.bean;

public class Wolvo extends Car{

    @Override
    public void start() {
        System.out.println("Wolvo start");
    }

    @Override
    public void stop() {
        System.out.println("Wolvo stop");
    }

    @Override
    public void speedUp() {
        System.out.println("Wolvo speed Up");
    }
}
