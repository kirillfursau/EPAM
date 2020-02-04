package cycles;

public class Exe2 {
    public static void main(String[] args) {
        /*
        Вычислить значения функции на отрезке [а,b] c шагом h:
        */
        int a = 3;
        int b = 6;
        int h = 4;
        int y;
        for (int x = a; x <= b; x += h) {
            System.out.print("x = " + x + ",");
            if (x <= 2) {
                y = -x;
                System.out.println("y = " + y);
            } else if (x >= 2) {
                y = x;
                System.out.println("y = " + y);
            }
        }
    }
}
