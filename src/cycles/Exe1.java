package cycles;

import java.util.Scanner;

public class Exe1 {
    static int number;

    public static void main(String[] args) {
        /*
        Напишите программу, где пользователь вводит
        любое целое положительное число. А программа суммирует
        все числа от 1 до введенного пользователем числа.
        */
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a positive number: ");
            number = scanner.nextInt();
        } while (number <= 0);
        int sumOfNumbers = 0;
        for (int i = 1; i <= number; i++) {
            sumOfNumbers += i;
        }
        System.out.println(sumOfNumbers);
        scanner.close();
    }
}
