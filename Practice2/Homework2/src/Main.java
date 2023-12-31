import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Написать программу, вычисляющую корни квадратного уравнения вида ax ² + bx + c = 0,
        где a, b и c - целочисленные параметры функции run.
       Вывести корни квадратного уравнения на консоль.
       Если их два, то перечислить каждый с новой строки в консоли
       (просто использовать два раза System.out.println).
       Если дискриминант отрицательный, вывести на консоль сообщение "нет корней".
       При решении создать и использовать следующие функции:
       - функция isPositive, определяющая, является ли число положительным
       - функция isZero, определяющая, является ли число нулём
       - функция discriminant, вычисляющая дискриминант
       Обращайте внимание, что параметры все целочисленные, а корни могут иметь дробную часть!*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a");
        int a = sc.nextInt();
        System.out.println("Введите b");
        int b = sc.nextInt();
        System.out.println("Введите c");
        int c = sc.nextInt();

        int discr = discr(a, b, c);

        if (discr > 0) {
            double x1 = (-b + Math.sqrt(discr)) / (2 * a);
            double x2 = (-b - Math.sqrt(discr)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discr == 0) {
            double x1 = -(b / 2*  a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x1);
        } else {
            System.out.println("нет корней");


    }

    }

    public static int discr(int a, int b, int c) {
        return b * b - 4 * a * c;
    }

    public static boolean isPositive(int discr) {
        return discr > 0;
    }

    public static boolean isZero(int discr) {
        return discr == 0;
    }


}