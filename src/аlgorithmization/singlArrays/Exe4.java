package аlgorithmization.singlArrays;

public class Exe4 {
    static int maxNumber;
    static int minNumber;

    public static void main(String[] args) {
        /*
        Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
        */
        int n = 10;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200) - 100;
            System.out.println(array[i]);
        }
        int placeMinNumber = 0;
        int placeMaxNumber = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (maxNumber < array[j]) {
                    maxNumber = array[j];
                    placeMaxNumber = j;
                }
                if (minNumber > array[j]){
                    minNumber = array[j];
                    placeMinNumber = j;
                }
            }
        }
        array[placeMinNumber] = maxNumber;
        array[placeMaxNumber] = minNumber;
    }
}
