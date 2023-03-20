package javaSE.ders4obyektler;

public class User {


    private String name;
    private  String sureName;
    private  int age;
    public  static  int objectCount=0;

    public  User(){
      this.name="name is undefined";
      this.sureName="Surename is undefined";
      this.age=-1;
      this.obyekYaradilanda();
      this.objectCount++;
    }

    public User(String name, String sureName, int age) {
        System.out.println("User parametrler ile yaradildi");
        this.name = name;
        this.sureName = sureName;
        this.age = age;
    }

    public  void obyekYaradilanda(){
        System.out.println("Men burada cox vacib is gorecem");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
