package аlgorithmization.arraysOfArrays;

public class Exe7 {
    public static void main(String[] args) {
        /*
        Сформировать квадратную матрицу порядка N по правилу:
        и подсчитать количество положительных элементов в ней.
        */
        int n = 10;
        int length = n;
        int counter = 0;
        double[][] array = new double[n][length];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < length; j++) {
                array[i][j] = Math.sin((double) ((i + 1) * (i + 1) - (j + 1) * (j + 1)) / n);
                if (array[i][j] > 0) counter++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < length; j++) {
                System.out.printf("%5.02f ", array[i][j]);
            }
            System.out.println();
        }
        System.out.println("The number of positive elements " + counter);
    }
}
