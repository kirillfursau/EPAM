package аlgorithmization.arraysOfArrays;

public class Exe12 {
    public static void main(String[] args) {
        /*
        Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
        */
        int height = 4;
        int length = 4;
        int[][] array = new int[height][length];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                array[i][j] = (int) (Math.random() * 20 - 10);
                System.out.printf(" " + array[i][j]);
            }
            System.out.println();
        }
        System.out.println("Sort ascending element values : ");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                for (int k = 0; k < length - 1 - j; k++) {
                    if (array[i][k] > array[i][k + 1]) {
                        int buf = array[i][k];
                        array[i][k] = array[i][k + 1];
                        array[i][k + 1] = buf;
                    }
                }
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                System.out.printf(" " + array[i][j]);
            }
            System.out.println();
        }
        System.out.println("Sort in descending order of elements : ");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                for (int k = 0; k < length - 1 - j; k++) {
                    if (array[i][k] < array[i][k + 1]) {
                        int buf = array[i][k];
                        array[i][k] = array[i][k + 1];
                        array[i][k + 1] = buf;
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf("%2d ", array[i][j]);
            }
            System.out.println();
        }
    }
}
