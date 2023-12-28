import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        /*Имеется целое число, вводимое пользователем с консоли. Это число -
        сумма денег в рублях. Вывести это число, добавив к нему  слово
        "рубль" в правильнои падеже "рубль", "рубля", "рублей"
        рубль - 1, 21, !11
        рублей - 5, 6, 7, 9, 10, 11 - 19
        рубля - 2, 3, 4

        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the price");
        int price = sc.nextInt();

        if ((price % 10 == 1) && (price % 100 != 11)) {
            System.out.println(price + " рубль");
        } else if ((price % 10 == 2 || price % 10 == 3 || price % 10 == 4 )
                && !(price % 100 == 12 || price % 100 == 13 || price % 100 == 14)) {
            System.out.println(price + " рубля");
        } else {
            System.out.println(price + " рублей");
        }
    }
}
