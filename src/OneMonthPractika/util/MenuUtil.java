package OneMonthPractika.util;

public class MenuUtil {
    public  static void processMenu(int selectMenu){
        switch (selectMenu) {
            case 1 -> StudentUtil.registerStudents();
            case 2 -> StudentUtil.printAllRegisterStudents();
            case 3 -> StudentUtil.findStudentsAndPrint();
            case 4 -> StudentUtil.udpateStudentWithSplit();
        }

    }
}
