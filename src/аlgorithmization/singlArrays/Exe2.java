package аlgorithmization.singlArrays;

public class Exe2 {
    public static void main(String[] args) {
        /*
        Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
        числом. Подсчитать количество замен.
        */
        int counter = 0;
        int n = 10;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200) - 100;
            System.out.println(array[i]);
        }
        int z = 12;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                counter++;
            }
        }
    }
}
