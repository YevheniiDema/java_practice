import java.util.Scanner;

public class Practice3 {
    /*Дано целое число определить, является ли последняя
    цифра этого числа - цифрой 3*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number");
        int number = sc.nextInt();
        if (number % 10 == 3) {
            System.out.println("Последняя цифра числа " + number + " является 3");
        } else {
            System.out.println("Последняя цифра числа " + number + " не является 3");
        }
    }
}
