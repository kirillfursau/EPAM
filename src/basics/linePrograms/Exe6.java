package basics.linePrograms;

public class Exe6 {
    public static void main(String[] args) {
        /*
        Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
        принадлежит закрашенной области, и false — в противном случае:
        */
        int x = 0;
        int y = -1;
        System.out.println(y <= 0 && y >= -3 && x <= 4 && x >= -4 || y >= 0 && y <= 4 && x >= -2 && x <= 2);
    }

}
