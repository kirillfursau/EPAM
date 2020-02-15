package аlgorithmization.singlArraysSortings;

import java.util.Arrays;

import static аlgorithmization.singlArraysSortings.Exe5.binarySearch;

public class Exe7 {
    public static void main(String[] args) {
        /*
        Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm
        Требуется указать те места, на которые нужно вставлять элементы последовательности b1 <= b <= ... <= bm в первую
        последовательность так, чтобы новая последовательность оставалась возрастающей.
        */
        int firstArray[] = {1, 3, 5, 7, 9};
        int secondArray[] = {2, 4, 8};
        int thirdArray[] = new int[firstArray.length + secondArray.length];
        int k = firstArray.length;
        int position;
        System.arraycopy(firstArray, 0, thirdArray, 0, firstArray.length);
        for (int i = 0; i < secondArray.length; i++) {
            System.arraycopy(secondArray, i, thirdArray, k, 1);
            position = binarySearch(thirdArray, k, secondArray[i]);
            System.out.printf("element i = %d of secondArray insert in %d position %n", secondArray[i], position);
            insert(thirdArray, position, k);
            k++;
        }
        System.out.println("Result " + Arrays.toString(thirdArray));
    }

    private static void insert(int[] array, int insertIndexAt, int insertIndexFrom) {
        int temp = array[insertIndexAt];
        array[insertIndexAt] = array[insertIndexFrom];
        for (int i = insertIndexFrom; i > insertIndexAt; i--) {
            array[i] = array[i - 1];
        }
        array[insertIndexAt + 1] = temp;
    }


}

