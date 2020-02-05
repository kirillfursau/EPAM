package basics.cycles;

public class Exe8 {
    public static void main(String[] args) {
        /*
        Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
        */
        int c;
        int d;
        int a = 123;
        int b = 243;
        while (a > 0) {
            d = a % 10;
            a = a / 10;
            c = b;
            while (c > 0) {
                if (c % 10 == d) {
                    System.out.print(d + " ");
                    break;
                }
                c = c / 10;
            }
        }
    }
}
