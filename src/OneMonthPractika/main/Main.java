package OneMonthPractika.main;

import OneMonthPractika.beans.Student;
import OneMonthPractika.util.MenuUtil;
import OneMonthPractika.util.StudentUtil;
import OneMonthPractika.util.inputUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int menu = 0;

        while (true) {
            menu = inputUtil.requireNumber("What do yo want to do?"
                    + "\n 1.Register Student"
                    + "\n 2.Show all Student"
                    + "\n 3.Find Student"
                    + "\n 4.Update Student"
                    + "\n Secim edin"
            );
            MenuUtil.processMenu(menu);

        }
    }
}
