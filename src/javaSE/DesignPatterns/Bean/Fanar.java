package javaSE.DesignPatterns.Bean;



public class Fanar {
    private  String name;
    private String sureName;
    private String fatherName;
    private int age;


    private Fanar(){

    }
    private Fanar(String name, String sureName,String fatherName, int age ) {
        this.name = name;
        this.sureName = sureName;
        this.age = age;
        this.fatherName = fatherName;
    }


    public String getName() {
        return name;
    }
    public  static FanarBuilder builder(){
        return  new FanarBuilder();
    }

    public static class FanarBuilder {
        private Fanar  f =null;
        public FanarBuilder(){
            f=new Fanar();
        }

        public Fanar build(){
//            Fanar ff=f;
//            f=null;
//            return ff;
        return new Fanar(f.name,f.sureName,f.fatherName,f.age);
        }
        public  FanarBuilder whatIsYourName(String name){
            this.f.name=name;
            return this;
        }

        public  FanarBuilder whatIsYourFatherName(String fatherName){
            this.f.fatherName=fatherName;
            return this;
        }

        public  FanarBuilder HowOldAreYou(int age){
            this.f.age=age;
            return this;
        }
    }

}
