package аlgorithmization.singlArrays;

public class Exe8 {

    public static void main(String[] args) {
        /*
        Дана последовательность целых чисел a1,a2,,an. Образовать новую последовательность, выбросив из исходной
        те члены, которые равны min(a1,a2,,an).
        */
        int n = 10;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.println(array[i]);
        }
        int minNumber = array[0];
        int counterMinNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (minNumber >= array[j]) {
                    minNumber = array[j];
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == minNumber) {
                counterMinNumbers++;
            }
        }
        System.out.println("Min " + minNumber);
        System.out.println("counter " + counterMinNumbers);
        System.out.println();
        int[] newArray = new int[array.length - counterMinNumbers];
        int numberInNewArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != minNumber){
                newArray[numberInNewArray] = array[i];
                System.out.println(newArray[numberInNewArray]);
                numberInNewArray++;
            }
        }
    }
}


