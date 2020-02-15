package аlgorithmization.decomposition;

public class Exe3 {
    public static void main(String[] args) {
        /*
        Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
        */
        double a = 4;
        double area = getArea(a, a);
        System.out.println(area);
    }

    private static double getArea(double a, double b) {
        double degrees = 60;
        return ((a * b) / 2) * Math.sin(Math.toRadians(degrees)) * 6;
    }
}

