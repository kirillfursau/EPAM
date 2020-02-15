package аlgorithmization.decomposition;

public class Exe2 {
    public static void main(String[] args) {
        /*
        Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
        */
        int[] numbers = {18, 52, 32, 14};
        int lcd = largestCommonDivisor(numbers[0], numbers[1], numbers[2], numbers[3]);
        System.out.println("Largest Common Divisor = " + lcd);
    }

    private static int largestCommonDivisor(int a, int b, int c, int d) {
        int nod = a;
        for (int i = a; i > 0; i--) {
            if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0) {
                nod = i;
                break;
            }
        }
        return nod;
    }
}
