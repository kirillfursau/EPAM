package аlgorithmization.singlArrays;

public class Exe5 {
    public static void main(String[] args) {
        /*
        Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
        */
        int n = 10;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200) - 100;
            if (array[i] > i){
                System.out.println(array[i]);
            }
        }

    }
}
