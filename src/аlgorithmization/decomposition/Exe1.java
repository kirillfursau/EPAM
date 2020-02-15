package аlgorithmization.decomposition;

public class Exe1 {
    public static void main(String[] args) {
        /*
        Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
        натуральных чисел:
        */
        int a = 27;
        int b = 36;
        System.out.println(largestCommonDivisor(a, b));
        System.out.println(leastCommonMultiple(a, b));
    }

    private static int leastCommonMultiple(int a, int b) {
        return a * b / largestCommonDivisor(a, b);
    }

    private static int largestCommonDivisor(int a, int b) {
        int nod = a;
        for (int i = a; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                nod = i;
                break;
            }
        }
        return nod;
    }
}
