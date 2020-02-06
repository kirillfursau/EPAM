package аlgorithmization.arraysOfArrays;

public class Exe13 {
    public static void main(String[] args) {
        /*
        Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
        */
        int height = 4;
        int length = 4;
        int[][] array = new int[height][length];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                array[i][j] = (int) (Math.random() * 20 - 10);
                System.out.printf("  " + array[i][j]);
            }
            System.out.println();
        }
        System.out.println("Sort ascending element values : ");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                for (int k = 0; k < height - 1 - j; k++) {
                    if (array[k][i] > array[k + 1][i]) {
                        int temp = array[k][i];
                        array[k][i] = array[k + 1][i];
                        array[k + 1][i] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                System.out.printf("  " + array[i][j]);
            }
            System.out.println();
        }
        System.out.println("Sort in descending order of elements : ");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                for (int k = 0; k < height - 1 - j; k++) {
                    if (array[k][i] < array[k + 1][i]) {
                        int temp = array[k][i];
                        array[k][i] = array[k + 1][i];
                        array[k + 1][i] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                System.out.printf("  " + array[i][j]);
            }
            System.out.println();
        }
    }
}

