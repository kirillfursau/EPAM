package аlgorithmization.arraysOfArrays;

public class Exe11 {
    public static void main(String[] args) {
        /*
        Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк,
        в которых число 5 встречается три и более раз.
        */
        int height = 10;
        int length = 20;
        int sumOflines = 0;
        int[][] array = new int[height][length];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                array[i][j] = (int) (Math.random() * 16);
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        for (int i = 0; i < height; i++) {
            int counter = 0;
            for (int j = 0; j < length; j++) {
                if (array[i][j] == 5) {
                    counter++;
                }
                if (counter == 3) {
                    sumOflines++;
                    break;
                }
            }
        }
        int[] arrayOflines = new int[sumOflines];
        int numberInArray = 0;
        for (int i = 0; i < height; i++) {
            int counter = 0;
            for (int j = 0; j < length; j++) {
                if (array[i][j] == 5) {
                    counter++;
                }
                if (counter == 3) {
                    arrayOflines[numberInArray] = i;
                    numberInArray++;
                    break;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < arrayOflines.length; i++) {
            System.out.print(arrayOflines[i] + " ");
        }
    }
}
