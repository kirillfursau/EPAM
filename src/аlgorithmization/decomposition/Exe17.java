package аlgorithmization.decomposition;

public class Exe17 {
    public static void main(String[] args) {
        /*
        Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких действий
        надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
        */

        int number = 999999;
        int counter = 0;
        while (number > 0) {
            number -= sumDigitOfNumber(number);
            counter++;
        }
        System.out.println("The number of subtractions = " + counter);
    }

    private static int sumDigitOfNumber(int number) {
        int a = number;
        int sum = 0;
        while (number > 0) {
            number /= 10;
            a %= 10;
            sum += a;
            a = number;
        }
        return sum;
    }
}

