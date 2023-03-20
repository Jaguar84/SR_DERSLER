package javaSE.DesignPatterns.Bean;

import java.io.Serializable;

public class Fanar1 extends  Device implements Serializable {
   private  String name=null;  // effectivly final
    private Mercedes m=null;

    public Mercedes getM() {
//        Mercedes mm=new Mercedes();
//        mm.name=m.name;
        return m;
    }

    public Fanar1(String name, Mercedes m) {
        this.name = name;
        this.m=m;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public Fanar1(){

    }
    private static Fanar1 f=null;
    public  static Fanar1 instance(){
        if(f==null){
            f=new Fanar1();
        }
        return f;
    }
    public void drive(){
        System.out.println("Drive methodu");
    }

}
