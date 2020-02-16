package аlgorithmization.decomposition;

public class Exe5 {
    public static void main(String[] args) {
        /*
        Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число, которое
        меньше максимального элемента массива, но больше всех других элементов).
        */
        int array[] = new int[]{0, 2, 8, 8, 4, 10, 10};
        sortBySelection(array);
    }

    private static void sortBySelection(int[] array) {
        int maxArray = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxArray < array[i]) {
                maxArray = array[i];
            }
        }
        if (array.length == 1) {
            System.out.println("No second element");
        } else {
            int secondMaxArray = array[0];
            for (int i = 0; i < array.length; i++) {
                if (secondMaxArray < array[i] && array[i] != maxArray) {
                    secondMaxArray = array[i];
                }
            }
            System.out.println("The second max number in array is " + secondMaxArray);
        }
    }
}

