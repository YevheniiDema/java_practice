import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Даны 3 переменные:
        - operand1 (double)
        - operand2 (double)
        - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
        Написать функцию, которая принимает в качестве параметров эти три
        переменные и возвращает результат операции.
        Протестировать функцию в main.
        Например:
        Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
        Результат: 34.5 (24.4 + 10.1)*/
        double operand1 = 24.4;
        double operand2 = 10.1;
        char operation = '+';

        double mathRes = result(operand1, operand2, operation);
        System.out.println(mathRes);

    }
    public static double result(double num1, double num2, char action){
        if (action == '+'){
            return num1 + num2;
        } else if (action == '-') {
            return num1 - num2;
        } else if (action == '/') {
            return num1 / num2;
        } else {
            return num1 * num2;
        }
    }
}