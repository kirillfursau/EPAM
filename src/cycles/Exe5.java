package cycles;

public class Exe5 {
    public static void main(String[] args) {
        /*
        Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
        Общий член ряда имеет вид:
        */
        double e = 2;
        double j = 1;
        double sum = 0;
        double n = 1 / (Math.pow(2, j)) + 1 / (Math.pow(3, j));
        while (n >= e) {
            sum += n;
            j++;
            n = 1 / (Math.pow(2, j)) + 1 / (Math.pow(3, j));
        }
        System.out.println("Sum = " + sum);
    }
}
