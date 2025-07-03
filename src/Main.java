import java.sql.Array;
import java.util.Arrays;

public class Main {

    public int arrayProc(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int currentRow = 0;
        int currentCol = 0;
        int sum = 0;

        if (arr[0].getClass().isArray() && arr.length == 2) {
            for (int i = 0; i < arr.length; i++) {
                currentRow = i;
                for (int j = 0; j < arr[currentRow].length; j++) {
                    currentCol = j;
                    try {
                        sum += Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException("Ошибка преобразования", currentRow, currentCol);
                    }

                }
                System.out.println();
            }
        } else {
            throw new MyArraySizeException("Массив не двумерный");
        }

        return sum;
    }

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        Main sumNum = new Main();
        String arr[][] = {
            {"1", "2", "3"},
            {"4", "5", "6"},
        };
        System.out.println(sumNum.arrayProc(arr));

    }
}
