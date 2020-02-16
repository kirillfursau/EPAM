package аlgorithmization.decomposition;

public class Exe6 {
    public static void main(String[] args) {
        /*
        Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
        */
        int a = 16;
        int b = 17;
        int c = 16;
        int result = isThreeNumbersAreCoprime(a, b, c);
        System.out.println((result == 1) ? "Three numbers are coprime" : "Three numbers are  not coprime");
    }

    private static int isThreeNumbersAreCoprime(int a, int b, int c) {
        int nod = 1;
        if (a == 0 || b == 0 || c == 0) {
            System.out.println("0 is not prime numder");
            return 0;
        } else {
            for (int i = c; i > 0; i--) {
                if (a % i == 0 && b % i == 0 && c % i == 0) {
                    nod = i;
                    return nod;
                }
            }
            return nod;
        }
    }
}
