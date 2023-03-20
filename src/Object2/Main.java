package Object2;

public class Main {
    public static void main(String[] args) {
        User u=new User();
        u.name="Nusret";

        Student s =new Student();
        s.name="Fikret";
        u.student=s;
        System.out.println(u.student.name);

    }


}
