package linePrograms;

import java.text.DecimalFormat;

public class Exe4 {
    public static void main(String[] args) {
        /*
        Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
        Поменять местами дробную и целую части числа и вывести полученное значение числа.
        */
        DecimalFormat df = new DecimalFormat("###.###");
        double r = 332.999;
        Math.floor(r);
        double ddd = r - Math.floor(r);
        double f = ddd * 1000 + Math.floor(r) / 1000;
        System.out.println((df.format(f)).replace(',','.'));
    }
}
