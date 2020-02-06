package аlgorithmization.arraysOfArrays;

public class Exe4 {
    public static void main(String[] args) {
        /*
        Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        */
        int n = 4;
        int length = n;
        int[][] array = new int[n][length];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < length; j++) {
                if (i % 2 == 0) {
                    array[i][j] = j + 1;
                } else {
                    array[i][j] = n - j;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
