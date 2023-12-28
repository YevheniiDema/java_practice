public class Lesson5Practice1 {
    /*Написать функцию, которая принимает 2 целочисленных параметра
    * и возвращает наибольший из них*/
    public static void main(String[] args) {
        int value1 = 50;
        int value2 = 10;
        int result = getMax(value1, value2);
        System.out.println(result + " is max value");
    }

    public static int getMax(int firstValue, int secondValue) {
        if (firstValue > secondValue) {
            return firstValue;
        } else {
            return secondValue;
        }
    }

}
