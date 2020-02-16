package аlgorithmization.decomposition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exe10 {
    public static void main(String[] args) {
        /*
        Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются
        цифры числа N.
        */
        int n = 32405;
        int array[] = new int[30];
        createArray(n, array);
        System.out.println(Arrays.toString(array));
    }

    private static void createArray(int n, int[] array) {
        List<Integer> numbers = new ArrayList<>();
        while (n > 0) {
            numbers.add(n % 10);
            n = n / 10;
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = numbers.get((int) (Math.random() * numbers.size()));
        }
    }
}

