package cycles;

public class Exe6 {
    public static void main(String[] args) {
        /*
        Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера
        */
        for (int i = 0; i < 256; i++) {
            Character c = (char) i;
            System.out.println(c + " = " + i);
        }
    }
}
