package linePrograms;

public class Exe3 {
    public static void main(String[] args) {
        /*
        Вычислить значение выражения по формуле (все переменные принимают действительные значения):
        𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦
        ----------- * ∗ 𝑡𝑔 𝑥𝑦
        𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦
        */
        int x = 3;
        int y = 2;
        double c = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan((x * y));
    }
}
