import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

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

    public static void checkIntSign(int a){
        if (a >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean checkIntSignSecond(int a) {
        if (a >= 0){
            return false;
        }
        return true;
    }

    public static void stringRepeat(String str, int a ){
        int count = 0;
        while (count < a) {
            System.out.println(str);
            count++;
        }
    }

    public static boolean checkLeapYear(int year){
        if (year % 100 == 0 && year % 400 != 0){
            return false;
        } else if(year % 4 == 0) {
            return true;
        }
        return false;
    }

    public static void intArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int count = 0; count < arr.length; count++){
            if(arr[count] == 0) {
                arr[count] = 1;
            } else {
                arr[count] = 0;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void intArraySecond(){
        int[] arr = new int[100];

        for(int count = 0; count < arr.length; count++) {
            arr[count] = count+1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void arrayItration() {
       int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for(int count = 0; count < arr.length; count++) {
            if(arr[count] < 6) {
                arr[count] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void squareArrayItration() {
        int[][] arr = new int[4][4];

        for(int count = 0; count < arr.length; count++) {
            arr[count][count] = 1;
        }
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
    }

    public static int[] array(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(checkIntSum(16, 4));
        checkIntSign(0);
        System.out.println(checkIntSignSecond(0));
        stringRepeat("Some string", 1);
        System.out.println(checkLeapYear(2400));
        intArray();
        intArraySecond();
        arrayItration();
        squareArrayItration();
        System.out.println(Arrays.toString(array(5, 7)));
    }
}
