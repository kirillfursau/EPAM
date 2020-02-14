package аlgorithmization.singlArraysSortings;

public class Exe5NotAll {
    public static void main(String[] args) {
        /*
        Сортировка вставками. Дана последовательность чисел a1,a2,,an . Требуется переставить числа в порядке
        возрастания. Делается это следующим образом. Пусть a1,a2,,ai - упорядоченная последовательность, т. е.
        a1 <= a2 <=  <=an . Берется следующее число ai +1 и вставляется в последовательность так, чтобы новая
        последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
        не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить с
        помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
        */
        int index = binarySearch(new int[]{89, 57, 91, 47, 95, 3, 27, 22, 67, 99}, 67);
        System.out.println(index);
    }

    public static int binarySearch(int arr[], int elementToSearch) {

        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (arr[middleIndex] == elementToSearch) {
                return middleIndex;
            }
            // если средний элемент меньше
            // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
            else if (arr[middleIndex] < elementToSearch) {
                firstIndex = middleIndex + 1;
                // если средний элемент больше
                // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
            } else if (arr[middleIndex] > elementToSearch)
                lastIndex = middleIndex - 1;

        }
        return -1;
    }

}
