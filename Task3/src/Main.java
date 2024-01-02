public class Main {
    public static void main(String[] args) {
        /*Даны два прямоугольных треугольника. Каждый из них задается двумя
        целочисленными переменными a и b - стороны треугольника.
        Написать код, в котором вычисляется площадь каждого треугольника и затем эти
        площади сравниваются друг с другом.
        Для этого понадобится написать 2 функции.
        Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
        Вторая: сравнивает переданные площади двух треугольников и выводит на консоль
        первый треугольник больше, меньше или равен второму.
        Учитывать, что площадь может быть вещественным числом.*/
        int a1 = 4;
        int b1 = 6;
        int a2 = 4;
        int b2 = 5;
        double s1 = areaTriangle(a1, b1);
        double s2 = areaTriangle(a2, b2);
        System.out.println(comparisionTriangle(s1, s2));


    }

    public static double areaTriangle(int a, int b){
        return (double) (a * b) /2;
    }

    public static String comparisionTriangle(double s1, double s2){
        if (s1 > s2) {
            return "Первый треугольник больше";
        } else if (s1 < s2) {
            return "Второй треугольник больше";
        } else {
            return "Треугольники равны";
        }
    }

}