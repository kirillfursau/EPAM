package аlgorithmization.arraysOfArrays;

public class Exe2 {
    public static void main(String[] args) {
        /*
        Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
        */
        int height = 5;
        int length = 5;
        int[][] array = new int[height][length];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
            System.out.print(" " + array[i][i]);
        }
    }
}


