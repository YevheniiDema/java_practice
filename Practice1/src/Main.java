public class Main {
    public static void main(String[] args) {
//            byte, schort, int, char, String, enum
        int value = 2;
        switch (value) {
            case 1:
                System.out.println("Value == 1");
                break;
            case 2:
                System.out.println("Value == 2");
                break;
            case 10:
                System.out.println("Value == 10");
                break;
            case 28:
                System.out.println("Value == 28");
                break;
            default:
                System.out.println("Нет такого значения");
        }
    }
}