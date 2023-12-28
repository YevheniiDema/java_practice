import java.util.Scanner;

public class Practice5 {
    /*Написать программу которая считывает год, введенный пользоветелем
    * и опеределяет является ли этот год высокосным.
    * Год является высокосным если он делится без остатка на 4. Однако,
    *  если год также делится на 100 то этот год не высокосный. за исключением
    * годов, делящихся на 400
    * Например:
    * 1992 - высокосный
    * 1900 - не высокосный
    * 2000 - высокосный*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the year");
        int year = sc.nextInt();
        isLeapYear(year);


    }
//    public static void isLeapYear(int year) {
//        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//            System.out.println(year + " високосный");
//        } else {
//            System.out.println(year + " не  високосный");
//        }
//    }
//        public static boolean isLeapYear(int year) {
//        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//           return true;
//        } else {
//            return false;
//        }
//    }
        public static boolean isLeapYear(int year) {
            return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        }
}
