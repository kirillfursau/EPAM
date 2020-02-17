package аlgorithmization.decomposition;

public class Exe13 {
    public static void main(String[] args) {
        /*
        Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
        Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
        Для решения задачи использовать декомпозицию.
        */
        int n = 20;
        int[] array = new int[n * 2];
        for (int i = 0; i < array.length; i++) {
            if (isPrime(n) == 1) {
                array[i] = n;
            }
            n++;
        }
        sortBySelection(array);
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] - array[i] == 2 && array[i] != 0) {
                System.out.println("numbers twins " + array[i] + " " + array[i - 1]);
            }
        }
    }

    private static int isPrime(int a) {
        int div = 1;
        if (a == 0 || a == 1) {
            System.out.println(" 0 and 1 is not prime numder");
            return 0;
        } else {
            for (int i = a; i > 1; i--) {
                if (a % i == 0) {
                    div = i;
                }
            }
            return div == a ? 1 : 0;
        }
    }

    private static void sortBySelection(int[] array) {
        for (int n = 0; n < array.length; n++) {
            int maxIndex = n;
            int max = array[n];
            for (int i = n + 1; i < array.length; i++) {
                if (array[maxIndex] < array[i]) {
                    maxIndex = i;
                }
            }
            max = array[maxIndex];
            array[maxIndex] = array[n];
            array[n] = max;
        }
    }
}


