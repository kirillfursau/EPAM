package аlgorithmization.decomposition;

public class Exe7 {
    public static void main(String[] args) {
        /*
        Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
        */
        int sum = 0;
        for (int i = 1; i <= 9; i += 2) {
            sum += getFactorial(i);
        }
        System.out.println(sum);
    }

    private static int getFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

