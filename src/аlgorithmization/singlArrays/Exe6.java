package аlgorithmization.singlArrays;

public class Exe6 {
    public static void main(String[] args) {
        /*
        Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
        являются простыми числами.
        */
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200);
            System.out.println(array[i]);
        }
        int sum = 0;
        for (int i = 2; i < array.length; i++) {
            boolean isOdd = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0 && i != j) {
                    isOdd = true;
                    break;
                }
            }
            if (!isOdd){
                sum += array[i];
            }
        }
        System.out.println("sum " + sum);
    }
}
