import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
    /*Дан порядковый номер месяца. Вывести на консоль пору года,
     к котрой относится месяц*/
//        int month = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the number of month");
        int month = sc.nextInt();

        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Spring");
        } else if (month == 6 || month == 7 || month ==8 ) {
            System.out.println("Summer");
        } else {
            System.out.println("Autumn");
        }

    }
}
