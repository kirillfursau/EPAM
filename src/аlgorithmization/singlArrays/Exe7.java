package аlgorithmization.singlArrays;

public class Exe7 {
    public static void main(String[] args) {
        /*
        Даны действительные числа a1,a2,,an . Найти max(a1 +a2n,a2 +a2n−1,,an +an+1)
        */
        int n = 10;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200);
            System.out.println(array[i]);
        }
        int max = 0;
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            max = Math.max(max, array[i] + array[j]);
        }
        System.out.println(max);
    }
}
