package аlgorithmization.singlArrays;

public class Exe3 {
    public static void main(String[] args) {
        /*
        Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
        положительных и нулевых элементов.
        */
        int negative = 0;
        int positive = 0;
        int zero = 0;
        int n = 10;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200) - 100;
            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positive++;
            } else if (array[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println("Positive numbers = " + positive);
        System.out.println("Negative numbers = " + negative);
        System.out.println("Zero numbers = " + zero);
    }
}
