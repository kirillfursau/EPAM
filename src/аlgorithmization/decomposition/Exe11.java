package аlgorithmization.decomposition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exe11 {
    public static void main(String[] args) {
        /*
        Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
        */
        double a = 12345.6789;
        double b = 12345.678;
        if (numbersInNumber(a) == numbersInNumber(b)) {
            System.out.println("Draw");
        } else {
            System.out.println(numbersInNumber(a) - numbersInNumber(b) > 0 ? "More numbers in " + a :
                    "More numbers in " + b);
        }
    }

    private static int numbersInNumber(double number) {
        String s = String.valueOf(number);
        char[] array = s.toCharArray();
        int counter = 0;
        for (char a : array) {
            if (a != '.') {
                counter++;
            }
        }
        return counter;
    }
}

