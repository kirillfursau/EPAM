package basics.ramification;

public class Exe1 {
    public static void main(String[] args) {
        /*
        Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да,
        то будет ли он прямоугольным.
        */
        int a = 70;
        int b = 20;
        if ((a + b < 180) && (a == 90 || b == 90 || 180 - (a + b) == 90)) {
            System.out.println("This triangle may exist. This is a right triangle.");
        } else if (a + b < 180) {
            System.out.println("This triangle may exist");
        } else {
            System.out.println("This triangle can't exist.");
        }
    }
}
