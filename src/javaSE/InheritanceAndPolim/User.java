package javaSE.InheritanceAndPolim;

public class User extends  Person{
    public  double maas;


    public  void foo(){
        super.methodInPerson();
    }

    public  void  methodInPerson(){
        System.out.println("User method");
    }
}
