package cycles;

import java.math.BigInteger;

public class Exe4 {
    public static void main(String[] args) {
        /*
        Составить программу нахождения произведения квадратов первых двухсот чисел
        */
        BigInteger multiply = BigInteger.valueOf(1l);
        for (int i = 1; i <= 200; i++) {
            multiply = multiply.multiply(BigInteger.valueOf(i * i));
        }
        System.out.println(multiply);
    }
}
