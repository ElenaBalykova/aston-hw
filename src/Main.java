import java.sql.SQLOutput;

public class Main {
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = -4;
        int b = 3;
        int sum = a + b;

        if (sum >= 0){
            System.out.println("Cумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 100;

        if (value > 0 & value < 101) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        } else {
            System.out.println("Красный");
        }
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 3;

        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }

    public static boolean checkIntSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 & sum <= 20){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(checkIntSum(16, 4));
    }
}
