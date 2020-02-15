package аlgorithmization.singlArraysSortings;

public class Exe8 {
    public static void main(String[] args) {
        /*
        Даны дроби (натуральные). Составить программу, которая приводит эти дроби к общему
        знаменателю и упорядочивает их в порядке возрастания.
        */
        int[][] fractions = {{5, 7}, {2, 3}, {7, 8}, {1, 4}};
        int multiplier;
        int k = 0;
        int lcm = fractions[0][1];
        do {
            lcm = leastCommonMultiple(lcm, fractions[k + 1][1]);
            k++;
        } while (k < fractions.length - 1);
        for (int i = 0; i < fractions.length; i++) {
            for (int j = 0; j < fractions[i].length; j++) {
                multiplier = lcm / fractions[i][1];
                fractions[i][j] *= multiplier;
            }
        }
        sortBySelection(fractions, 0);
        for (int i = 0; i < fractions.length; i++) {
            for (int j = 0; j < fractions[i].length; j++) {
                System.out.printf("%d ", fractions[i][j]);
            }
            System.out.println();
        }
    }

    private static int leastCommonMultiple(int m, int n) {
        return m * n / largestCommonDivisor(m, n);
    }

    private static int largestCommonDivisor(int a, int b) {
        int nod = 1;
        for (int i = a; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                nod = i;
                break;
            }
        }
        return nod;
    }

    private static void sortBySelection(int[][] arr, int column) {
        for (int n = 0; n < arr.length; n++) {
            int maxIndex = n;
            int max = arr[n][column];
            for (int i = n + 1; i < arr.length; i++) {
                if (arr[maxIndex][column] > arr[i][column]) {
                    maxIndex = i;
                }
            }
            max = arr[maxIndex][column];
            arr[maxIndex][column] = arr[n][column];
            arr[n][column] = max;
        }
    }
}
