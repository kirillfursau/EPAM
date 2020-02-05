package basics.ramification;

public class Exe5 {
    public static void main(String[] args) {
        /*
        Вычислить значение функции:
         */
        int x = 4;
        double f;
        if (x <= 3) {
            f = Math.pow(x, 2) - (3 * x) + 9;
        } else {
            f = (1) / (Math.pow(x, 3) + 6);
        }
        System.out.println(f);
    }
}
