package аlgorithmization.singlArraysSortings;

import java.util.Arrays;

public class Exe5 {
    public static void main(String[] args) {
        /*
        Сортировка вставками. Дана последовательность чисел a1,a2,,an . Требуется переставить числа в порядке
        возрастания. Делается это следующим образом. Пусть a1,a2,,ai - упорядоченная последовательность, т. е.
        a1 <= a2 <=  <=an . Берется следующее число ai +1 и вставляется в последовательность так, чтобы новая
        последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
        не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить с
        помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
        */
        int array[] = new int[]{10, 2, 5, 7, 1};
        int indexFrom;
        int indexAt;
        int i = 1;
        while (i < array.length) {
            if (array[i - 1] > array[i]) {
                indexAt = binarySearch(array, i - 1, array[i]);
                indexFrom = i;
                int temp = array[indexAt];
                array[indexAt] = array[indexFrom];
                for (int j = indexFrom; j > indexAt; j--) {
                    array[j] = array[j - 1];
                }
                array[indexAt + 1] = temp;
            }
            i++;
        }
        System.out.println(Arrays.toString(array));
    }

    static int binarySearch(int[] array, int lastIndex, double searchElement) {
        int firstIndex = 0;
        while (firstIndex < lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (array[middleIndex] == searchElement) {
                return middleIndex;
            } else if (array[middleIndex] >= searchElement) {
                lastIndex = middleIndex;
            } else firstIndex = middleIndex + 1;
        }
        if (searchElement > array[lastIndex]) {
            return lastIndex + 1;
        } else {
            return lastIndex;
        }
    }
}
