package аlgorithmization.singlArraysSortings;

import java.util.Arrays;

public class Exe2 {
    public static void main(String[] args) {
        /*
        Даны две последовательности a1 <= a2 <= ... an и b1 <= b2 <= ... bm . Образовать из них новую
        последовательность чисел так, чтобы она тоже была неубывающей. Примечание.
        Дополнительный массив не использовать.
        */
        int[] firstArray = {1, 3, 5, 7, 9};
        int[] secondArray = {0, 4, 2, 6, 8};
        firstArray = Arrays.copyOf(firstArray, firstArray.length + secondArray.length);
        for (int i = 0; i < secondArray.length; i++) {
            firstArray[firstArray.length - i - 1] = secondArray[i];
        }
        Arrays.sort(firstArray);
        for (int i : firstArray) {
            System.out.println(i);
        }
    }
}
