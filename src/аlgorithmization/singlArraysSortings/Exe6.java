package аlgorithmization.singlArraysSortings;

public class Exe6 {
    public static void main(String[] args) {
    /*
    Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
    Делается это следующим образом: сравниваются два соседних элемента ai и ai+1 . Если ai <= ai+1 , то продвигаются
    на один элемент вперед. Если ai > ai+1 , то производится перестановка и сдвигаются на один элемент назад.
    Составить алгоритм этой сортировки.
    */
        int[] array = {9, 7, 4, 3, 2, 1};
        for (int i = 0; i < array.length - 1; ) {
            if (array[i] <= array[i + 1]) {
                i++;
            } else if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                if (i != 0) {
                    i--;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
