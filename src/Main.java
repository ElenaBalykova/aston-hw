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

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
    }
}
