package javaSE.bean;

public abstract class Car extends Mechanic {
    public int a;
    public abstract void start();
    public abstract void stop();
    public abstract void speedUp();
    public  void startAndSpeedUp(){
        start();
        speedUp();
    }

}
