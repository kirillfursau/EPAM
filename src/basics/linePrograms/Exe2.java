package basics.linePrograms;

public class Exe2 {
    public static void main(String[] args) {
        /*
        Вычислить значение выражения по формуле (все переменные принимают действительные значения):
        𝑏 + √𝑏^2 + 4𝑎𝑐
        ------------- + 𝑎^3𝑐+𝑏^-2
             2𝑎
        */
        int b = 6;
        int a = 3;
        int c = 0;
        double d = ((b + Math.sqrt((Math.pow(b, 2)) + (4 * a * c))) / (2 * a)) - ((Math.pow(a, 3)) * c)
                + Math.pow(b, -2);
    }
}
