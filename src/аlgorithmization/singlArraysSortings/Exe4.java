package аlgorithmization.singlArraysSortings;

public class Exe4 {
    public static void main(String[] args) {
        /*
        Сортировка обменами. Дана последовательность чисел a1 <= a2 <= ... an .Требуется переставить числа в
        порядке возрастания. Для этого сравниваются два соседних числа ai и ai+1 . Если ai > ai+1 , то делается
        перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
        Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
        */
        int counter = 0;
        int[] array = {9, 2, 4, 3, 9, 9};
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                i = 0;
                counter++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println("Reshuffles " + counter);
    }
}
