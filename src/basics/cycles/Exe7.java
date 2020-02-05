package basics.cycles;

import java.util.Scanner;

public class Exe7 {
    static int m;
    static int n;

    public static void main(String[] args) {
        /*
        Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
        m и n вводятся с клавиатуры.
        */
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter the beginning of the gap : ");
            m = scanner.nextInt();
            System.out.print("Enter the end of the gap : ");
            n = scanner.nextInt();
        } while (m < 0 || n < 0 || m > n);
        for (int i = m; i <= n; i++) {
            System.out.print(i + "  = ");
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.print(j + ", ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
