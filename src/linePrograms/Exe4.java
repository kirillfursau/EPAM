package linePrograms;

import java.text.DecimalFormat;

public class Exe4 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###.###");
        double r = 332.999;
        Math.floor(r);
        double ddd = r - Math.floor(r);
        double f = ddd * 1000 + Math.floor(r) / 1000;
        System.out.println((df.format(f)).replace(',','.'));
    }
}
