package аlgorithmization.arraysOfArrays;

public class Exe17 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int matrixSize = 3;
        int[][] array = new int[matrixSize][matrixSize];
        boolean isMagic = false;
        int k = 0;
        int j = 0;
        int counter = 0;
        while (!isMagic) {
            while (counter < 9) {
                k = (int) (Math.random() * matrixSize);
                j = (int) (Math.random() * matrixSize);
                if (array[k][j] == 0) {
                    array[k][j] = numbers[counter];
                    counter++;
                }
            }
            counter = 0;
            int sum = array[0][0] + array[0][1] + array[0][2];
            if ((array[0][0] + array[0][1] + array[0][2] == sum) &&
                    (array[1][0] + array[1][1] + array[1][2] == sum) &&
                    (array[2][0] + array[2][1] + array[2][2] == sum) &&
                    (array[0][0] + array[1][0] + array[2][0] == sum) &&
                    (array[0][1] + array[1][1] + array[2][1] == sum) &&
                    (array[0][2] + array[1][2] + array[2][2] == sum) &&
                    (array[0][0] + array[1][1] + array[2][2] == sum) &&
                    (array[0][2] + array[1][1] + array[2][0] == sum)) {
                isMagic = true;
            }else{
                for (int i = 0; i < matrixSize; i++) {
                    for (int l = 0; l < matrixSize; l++) {
                        array[i][l] = 0;
                    }
                    System.out.println();
                }
            }
        }
        for (int i = 0; i < matrixSize; i++) {
            for (int l = 0; l < matrixSize; l++) {
                System.out.print(array[i][l] + " ");
            }
            System.out.println();
        }
    }
}

