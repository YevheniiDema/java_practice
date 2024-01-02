public class Main {
    public static void main(String[] args) {
        /*В переменной minutes лежит число от 0 до 59.
        Написать функцию, которая принимает в качестве параметра значение переменной 
        minutes и выводит на консоль в какую четверть часа попадает это число 
        (в первую, вторую, третью или четвертую).
        Протестировать функцию в main.*/
        int minutes = 60;
        String result = numQuater(minutes);
        System.out.println(result);
    }
    
    public static String numQuater(int min) {
        if (min >= 0 && min <= 15) {
            return "Первая четверть часа";
        } else if (min > 15 && min <= 30) {
            return "Вторая четверть часа";
        } else if (min > 30 && min <= 45) {
            return "Третья четверть часа";
        } else if (min > 45 && min <= 59) {
           return "Четвертая четверть часа";
        } else {
            return "Время не валидно";
        }

    }
}