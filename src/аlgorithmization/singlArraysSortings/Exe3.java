package аlgorithmization.singlArraysSortings;

public class Exe3 {
    public static void main(String[] args) {
        /*
        Сортировка выбором. Дана последовательность чисел a1 <= a2 <= ... an .Требуется переставить элементы так,
        чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший элемент
        и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
        повторяется. Написать алгоритм сортировки выбором.
        */
        int[] array = {9, 2, 9, 3, 1, 4};
        for (int i = 0; i < array.length - 1; i++) {
            int least = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[least]) {
                    least = j;
                }
            }
            int tmp = array[i];
            array[i] = array[least];
            array[least] = tmp;
        }
        for (int i : array) {
            System.out.print(i);
        }
    }
}
