package ramification;

public class Exe3 {
    public static void main(String[] args) {
        int x1 = 1;
        int y1 = 8;
        int x2 = -2;
        int y2 = -7;
        int x3 = -4;
        int y3 = -17;
        if ((x1 - x3) * (y2 - y3) == (x2 - x3) * (y1 - y3)) {
            System.out.println("Points on the same line");
        }else{
            System.out.println("Points on the different lines");
        }
    }
}
