package аlgorithmization.arraysOfArrays;

public class Exe9 {
    public static void main(String[] args) {
        /*
        Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить,
        какой столбец содержит максимальную сумму.
        */
        int height = 3;
        int length = 3;
        int[][] array = new int[height][length];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        int maxSum = 0;
        int numberOfMaxColumn = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[0].length; j++) {
                sum = sum + array[j][i];
            }
            if (sum > maxSum) {
                maxSum = sum;
                numberOfMaxColumn = i;
            }
        }
        System.out.println("Column with max sum is  " + numberOfMaxColumn);
    }
}

