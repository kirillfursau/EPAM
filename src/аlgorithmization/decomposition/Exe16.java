package аlgorithmization.decomposition;

public class Exe16 {
    public static void main(String[] args) {
        /*
        Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. Определить также,
        сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
        */
        int n = 2;
        int[] array = new int[n];
        int number = (int) Math.pow(10, n) - 1;
        int sum;
        int value;
        for (int i = 0; i < number; i++) {
            numberInArray(i, array);
            sum = isOddNumber(array);
            if (sum != 0) {
                numberInArray(sum, array);
                value = countEvenDigit(array);
                System.out.printf("i = %d  sum = %d  value = %d%n", i, sum, value);
            }
        }
    }

    private static void numberInArray(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = number % 10;
            number /= 10;
        }
    }

    private static int isOddNumber(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                return 0;
            } else {
                sum += array[i];
            }
        }
        return sum;
    }

    private static int countEvenDigit(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                counter++;
            }
        }
        return counter;
    }
}

