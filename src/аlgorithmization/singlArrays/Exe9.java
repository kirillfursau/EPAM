package аlgorithmization.singlArrays;

public class Exe9 {
    public static void main(String[] args) {
        /*
        В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
        Если таких чисел несколько, то определить наименьшее из них.
        */
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.println(array[i]);
        }
        int mostFrequent = array[0];
        int counter = 0;
        int mostCounter = 0;
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            counter = 1;
            for (int j = 0; j < array.length; j++) {
                if (current == array[j]) {
                    counter++;
                }
            }
            if (mostCounter < counter) {
                mostCounter = counter;
                mostFrequent = array[i];
            }
        }
        System.out.println("MOst freq" + mostFrequent);
    }
}

