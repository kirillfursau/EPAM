package аlgorithmization.arraysOfArrays;

public class Exe3 {
    public static void main(String[] args) {
        /*
        Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
        */
        int height = 5;
        int length = 6;
        int k = 3;
        int p = 2;
        int[][] array = new int[height][length];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                array[i][j] = (int) (Math.random() * 100);
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < length; i++) {
            System.out.print(" " + array[k - 1][i]);
        }
        System.out.println();
        for (int i = 0; i < height; i++) {
            System.out.println(" " + array[i][p - 1]);
        }
    }
}

