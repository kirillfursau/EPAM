package аlgorithmization.singlArraysSortings;

import java.util.Arrays;

public class Exe1 {
    public static void main(String[] args) {
        /*
        Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в один
        массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя дополнительный
        массив.
        */
        int[] firstArray = {1, 2, 3, 4};
        int firstArraylength = firstArray.length;
        int[] secondArray = {5, 6, 7, 8};
        int k = 1;
        firstArray = Arrays.copyOf(firstArray, firstArraylength + secondArray.length);
        for (int i = 0; i < firstArraylength; i++) {
            if (i < k) {
                firstArray[i] = firstArray[i];
            } else {
                firstArray[secondArray.length + i] = firstArray[i];
            }
        }
        for (int i = 0; i < secondArray.length; i++) {
            firstArray[k + i] = secondArray[i];
        }
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + " ");
        }
    }
}
