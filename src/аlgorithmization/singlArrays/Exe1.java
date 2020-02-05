package аlgorithmization.singlArrays;

public class Exe1 {
    public static void main(String[] args) {
        /*
        В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
        */
        int[] array = {1, 2, 3, 4, 10, 12, 84, 76, 52, 18};
        int k = 3;
        int sum = 0;
        for (int i = 0; i < array.length;i++){
            if (array[i] % k == 0){
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}
