package аlgorithmization.decomposition;

public class Exe8 {
    public static void main(String[] args) {
        /*
        Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6]. Пояснение.
        Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами
        от k до m
        */
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 4;
        int step = 3;
        int sum1 = 0;
        if (k + step <= array.length && k >= 0) {
            sum1 += sumOf3(array, k, step);
            System.out.printf(" sum of three elements from position k = %d is %s%n", k, sum1);
        } else {
            System.out.println(" k must be in range from 0 to " + (array.length - step));
        }
    }

    private static int sumOf3(int[] array, int k, int step) {
        int sum = 0;
        for (int i = k; i < k + step; i++) {
            sum += array[i];
        }
        return sum;
    }
}

