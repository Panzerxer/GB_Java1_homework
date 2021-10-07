import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},


        };
        creator(array);
        checker(array);


    }

    public static void creator(String[][] array) throws MyArraySizeException {
        for(int i = 0; i < array.length; i++){
            if ( array[i].length > 4 )
            {throw  new ArrayIndexOutOfBoundsException("Не верный размер массива! (указанный: " + array[i].length + ", максимальный: 4)");
            }
        }

    }
    private static void checker(String[][] array) throws MyArrayDataException {
        int[][] perenos = new int[4][4];
        try {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {

                    try {

                        perenos[i][j] = Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                        System.out.println("Что-то не так с форматом" + " line: " + i + " column: " + j);
                    }

                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Не верный размер массива!");
        }
        sum(perenos);
    }

    private static void sum(int[] @NotNull [] perenos) {
        int b = 0;
        for (int i = 0; i < perenos.length; i++) {
            for (int j = 0; j < perenos.length; j++) {
                int a = perenos[i][j];
                b = b + a;
            }
        }
        System.out.println("Сумма: " + b);
    }


}
