package ramification;

public class Exe4 {
    public static void main(String[] args) {
        /*
        Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
        Определить, пройдет ли кирпич через отверстие.
        */
        int a = 5;
        int b = 6;
        int x = 3;
        int y = 4;
        int z = 12;
        if (((x < a) && (y < b) || (x < b) && (y < a)) || ((x < a) && (z < b) || (x < b) && (z < a)) ||
                ((y < a) && (z < b) || (y < b) && (z < a))) {
            System.out.println("Brick pass through a hole");
        } else {
            System.out.println("Brick will not pass through the hole");
        }
    }
}
