package аlgorithmization.singlArrays;

public class Exe1 {
    public static void main(String[] args) {
        /*
        В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
        */
        int n = 10;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200) - 100;
            System.out.println(array[i]);
        }
        int k = 3;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}
