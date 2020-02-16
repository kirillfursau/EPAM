package аlgorithmization.decomposition;

import java.util.Arrays;

import static java.lang.Math.*;

public class Exe4 {
    public static void main(String[] args) {
        /*
        На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими из пар
        точек самое большое расстояние. Указание. Координаты точек занести в массив.
        */
        double[][] points = {{2, 4}, {3, 5}, {6, 2}, {7, 8},};
        int maxXindex = 0;
        int maxYindex = 0;
        double maxDistance = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double dist = distanse(points[i], points[j]);
                if (dist > maxDistance) {
                    maxDistance = dist;
                    maxXindex = i;
                    maxYindex = j;
                }
            }
        }
        System.out.printf(" Max distance = %.3f between points:%n", maxDistance);
        printPoint(points[maxXindex]);
        printPoint(points[maxYindex]);
    }

    public static double distanse(double m1[], double m2[]) {
        return sqrt(pow(m1[0] - m2[0], 2)
                + pow(m1[1] - m2[1], 2));
    }

    private static void printPoint(double[] point) {
        System.out.println(Arrays.toString(point));
    }
}

