package linePrograms;

public class Exe5 {
    public static void main(String[] args) {
        int t = 1000;
        int hours = t / 24;
        int minutes = (t % 3600) / 60;
        int seconds = ((t % 3600)) % 60;
        System.out.println("Часов " + hours + " Минут" + minutes + " Секунд " + seconds);
    }
}
