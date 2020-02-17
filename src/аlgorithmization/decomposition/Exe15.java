package аlgorithmization.decomposition;

public class Exe15 {
    public static void main(String[] args) {
        /*
        Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
        (например, 1234, 5789). Для решения задачи использовать декомпозицию.
        */
        int n = 5;
        int[] array = new int[n];
        int N = (int) Math.pow(10, n) - 1;
        for (int i = 0; i < N; i++) {
            numberInArray(i, array);
            if (isIncreasing(array) == 1) {
                System.out.println(i);
            }
        }
    }

    private static void numberInArray(int number, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = number % 10;
            number /= 10;
        }
    }


    private static int isIncreasing(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                return 0;
            }
        }
        return 1;
    }
}
