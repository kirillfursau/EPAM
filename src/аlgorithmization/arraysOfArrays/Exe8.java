package аlgorithmization.arraysOfArrays;

import java.util.Scanner;

public class Exe8 {
    public static void main(String[] args) {
        /*
        В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
        на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
        пользователь с клавиатуры.
        */
        int height = 5;
        int length = 5;
        int[][] array = new int[height][length];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                array[i][j] = (int) (Math.random() * 100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first column number that will be swapped :");
        int k = sc.nextInt();
        System.out.print("Enter the second column number that will be swapped : ");
        int p = sc.nextInt();
        System.out.println("Transformed Matrix: ");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                if (j == k) {
                    int temp = array[i][j];
                    array[i][j] = array[i][p];
                    array[i][p] = temp;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
