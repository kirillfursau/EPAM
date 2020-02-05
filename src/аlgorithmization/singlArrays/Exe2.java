package аlgorithmization.singlArrays;

public class Exe2 {
    public static void main(String[] args) {
        /*
        Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
        числом. Подсчитать количество замен.
        */
        int counter = 0;
        int[] array = {1, 2, 3, 4, 10, 12, 84, 76, 52, 18};
        int z = 12;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                counter++;
            }
        }
    }
}
