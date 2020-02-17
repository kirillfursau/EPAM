package аlgorithmization.decomposition;

public class Exe15 {
    public static void main(String[] args) {
        /*
        Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
        (например, 1234, 5789). Для решения задачи использовать декомпозицию.
        */
        int n = 5;
        int[] array = new int[n];
        int number = (int) Math.pow(10, n) - 1;
        for (int i = 0; i < number; i++) {
            numberInArray(i, array);
            if (isIncreasing(array) == true) {
                System.out.println(i);
            }
        }
    }

    private static void numberInArray(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = number % 10;
            number /= 10;
        }
    }


    private static boolean isIncreasing(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
