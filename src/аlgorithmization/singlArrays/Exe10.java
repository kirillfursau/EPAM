package аlgorithmization.singlArrays;

public class Exe10 {
    public static void main(String[] args) {
    /*
    Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент
    (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
    */
        int n = 10;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.println(array[i]);
        }
        System.out.println();
        for (int i = 0; i < array.length; i += 2) {
            array[i] = 0;
        }
    }
}
