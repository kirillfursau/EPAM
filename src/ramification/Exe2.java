package ramification;

public class Exe2 {
    public static void main(String[] args) {
        /*
        Найти max{min(a, b), min(c, d)}.
        */
        int a = 3;
        int b = 5;
        int c = 6;
        int d = 8;
        int e = Math.max(Math.min(a, b), Math.min(c, d));
        System.out.println(e);
    }
}
