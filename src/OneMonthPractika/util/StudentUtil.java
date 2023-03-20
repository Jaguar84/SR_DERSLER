package OneMonthPractika.util;

import OneMonthPractika.beans.Student;
import OneMonthPractika.main.Config;

public class StudentUtil {

    public static Student fillStudent() {
        String name = inputUtil.requireText("Enter name");
        String surename = inputUtil.requireText("Enter sureame");
        int age = inputUtil.requireNumber("Enter age");
        String className = inputUtil.requireText("Enter class");


        Student student = new Student(name, surename, age, className);
        return student;
    }



    public static void printAllRegisterStudents() {
        if (Config.students == null) {
            return;
        }

        for (int i = 0; i < Config.students.length; i++) {
            Student student = Config.students[i];
            System.out.println((i+1)+"."+student.getFullInfo());
        }
    }



    public static void registerStudents() {
        int count = inputUtil.requireNumber("Nece telebe qeydiyyat ede bilersiz");
        Config.students = new Student[count];

        for (int i = 0; i < count; i++) {

            System.out.println((i + 1) + ".Register");
            Config.students[i] = StudentUtil.fillStudent();
        }

        System.out.println("Register completed successfull");
        StudentUtil.printAllRegisterStudents();
    }



    public static void findStudentsAndPrint() {
        String text = inputUtil.requireText("Type name, surename or class name");
        Student[] result=findStudents(text);

        for (int i = 0; i < result.length; i++) {
            Student student = Config.students[i];
            if (student.getName().contains(text) || student.getSurename().contains(text) || student.getClassName().contains(text)) {
                System.out.println(result[i].getFullInfo());
            }
        }
    }



    public static Student[] findStudents(String text) {
        int count = 0;

        for (int i = 0; i < Config.students.length; i++) {
            Student student = Config.students[i];
            if (student.getName().contains(text) || student.getSurename().contains(text) || student.getClassName().contains(text)) {
                student.getFullInfo();
                count++;
            }
        }

        Student[] result = new Student[count];
        int found = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student student = Config.students[i];
            if (student.getName().contains(text) || student.getSurename().contains(text) || student.getClassName().contains(text)) {

                result[found] = student;
                found++;
            }
        }
        return result;
    }



    public  static  void udpateStudentWithSplit(){

    }


}
