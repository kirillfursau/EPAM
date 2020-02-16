package аlgorithmization.decomposition;

import static java.lang.Math.*;

public class Exe9 {
    public static void main(String[] args) {
        /*
        Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади, если угол
        между сторонами длиной X и Y— прямой.
        */
        double x = 4.0;
        double y = 3.2;
        double z = 3.6;
        double t = 1.7;
        double g;
        g = sqrt(pow(x, 2) + pow(y, 2));
        double area = triangleArea(z, t, g) + (x * y) / 2;
        System.out.printf("Quadrangle area = %.3f", area);
    }

    private static double triangleArea(double z, double t, double g) {
        double h = (z + t + g) / 2;
        return sqrt((h * (h - g) * (h - z) * (h - t)));

    }
}
