package аlgorithmization.arraysOfArrays;

public class Exe14 {
    public static void main(String[] args) {
        /*
        Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
        единиц равно номеру столбца.
        */
        int m = 10;
        int n = 5;
        int[][] array = new int[m][n];
        for (int i = 0; i < n; i++) {
            boolean zero = false;
            while (!zero) {
                int count = 0;
                for (int j = 0; j < m; j++) {
                    array[j][i] = (int) (Math.random() * 2);
                    if (array[j][i] == 1) {
                        count++;
                    }
                }
                if (count == i + 1) {
                    zero = true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf(" " + array[i][j]);
            }
            System.out.println();
        }
    }
}



