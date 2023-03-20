package javaSE.DesingerPatternsProxy;

public class ProxyPatternDemo {

    public static void main(String[] args) {
       // Image image=new ProxyImage("test_10mb.img");
        //Image image=ObjectCreator.createObject(RealImage.class);
        Image image=ObjectCreator.createObject(RealImage.class);
        image.display();
        System.out.println("");
        image.display();
    }
}
