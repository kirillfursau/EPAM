package аlgorithmization.arraysOfArrays;

public class Exe15 {
    public static void main(String[] args) {
        /*
        Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
        */
        int height = 4;
        int length = 4;
        int maxElement = 0;
        int[][] array = new int[height][length];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                array[i][j] = (int) (Math.random() * 20 - 10);
                System.out.printf("  " + array[i][j]);
                if (array[i][j] > maxElement) {
                    maxElement = array[i][j];
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                if (array[i][j] % 2 == 1 || Math.abs(array[i][j]) % 2 == 1) {
                    array[i][j] = maxElement;
                }
                System.out.print("  " + array[i][j]);
            }
            System.out.println();
        }
    }
}
