package аlgorithmization.arraysOfArrays;

public class Exe1 {
    public static void main(String[] args) {
        /*
        Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
        */
        int height = 5;
        int length = 6;
        int[][] array = new int[height][length];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                array[i][j] = (int) (Math.random() * 100);
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < height; i++) {
            for (int j = 1; j < length; j += 2) {
                if (array[0][j] > array[height - 1][j]) {
                    System.out.print(" " + array[i][j]);
                }
            }
            System.out.println();
        }
    }
}

