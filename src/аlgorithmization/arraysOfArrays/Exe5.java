package аlgorithmization.arraysOfArrays;

public class Exe5 {
    public static void main(String[] args) {
        /*
        Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        */
        int n = 6;
        int length = n;
        int[][] array = new int[n][length];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < length - i; j++) {
                array[i][j] = i + 1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
