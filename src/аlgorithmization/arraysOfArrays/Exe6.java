package аlgorithmization.arraysOfArrays;

public class Exe6 {
    public static void main(String[] args) {
        /*
        Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        */
        int n = 6;
        int length = n;
        int[][] array = new int[n][length];
        for (int i = 0; i < n - i; i++) {
            for (int j = i; j < length - i; j++) {
                array[i][j] = 1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = length - i - 1; j < i + 1; j++) {
                array[i][j] = 1;
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
