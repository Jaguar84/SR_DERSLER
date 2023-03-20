package OneMonthPractika.beans;

public class Student {
    private String name;
    private String surename;
    private  int age;
    private String className;

    public Student() {
    }

    public Student(String name, String surename, int age, String className) {
        this.name = name;
        this.surename = surename;
        this.age = age;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public  String getFullInfo(){
        return this.getName()+" "+this.getSurename()+" "+this.getAge()+" "+this.getClassName();
    }

}
