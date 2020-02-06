package аlgorithmization.arraysOfArrays;

public class Exe10 {
    public static void main(String[] args) {
        /*
        Найти положительные элементы главной диагонали квадратной матрицы
         */
        int height = 3;
        int length = 3;
        int[][] array = new int[height][length];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                array[i][j] = (int) (Math.random() * 20) - 10;
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        for (int i =0; i < height;i++){
            if (array[i][i] > 0) {
                System.out.println(array[i][i]);
            }
        }
    }
}
