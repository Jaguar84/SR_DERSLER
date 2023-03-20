package javaSE.ABstractInterface;

import javaSE.bean.*;

public class main {
    public static void main(String[] args) {

//
//        Car car=new Car() {
//            @Override
//            public void start() {
//                System.out.println("ALma");
//            }
//
//            @Override
//            public void stop() {
//                System.out.println("Stop");
//            }
//
//            @Override
//            public void speedUp() {
//                System.out.println("Speed up");
//            }
//        };
//
//        System.out.println(car.getClass().getName());
//         car=new Car() {
//            @Override
//            public void start() {
//                System.out.println("Start1");
//            }
//
//            @Override
//            public void stop() {
//                System.out.println("Stop1");
//            }
//
//            @Override
//            public void speedUp() {
//                System.out.println("Speed up1");
//            }
//        };
//        System.out.println(car.getClass().getName());

//
//        BMW bmw=new BMW();
//
//        BMW.A a=bmw.new A();
//

//        Startable w=new Kia();
//
//        Startable[] startables={w};
//        startAllCars(startables);

        BMW bmw=new BMW();
//        Mechanic mechanic=bmw;
        Startable startable= (Startable) bmw;
        //Kia k=(Kia) bmw;


        //Startable startable= (Startable) bmw;
        //Car c=bmw;
    }

    public  static void startAllCars(Startable[] cars){
        for(int i=0; i<cars.length; i++){
            cars[i].start();
        }
    }


}
