package linePrograms;

public class Exe5 {
    public static void main(String[] args) {
        /*
        Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
        Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
        */
        int t = 1000;
        int hours = t / 24;
        int minutes = (t % 3600) / 60;
        int seconds = ((t % 3600)) % 60;
        System.out.println("Часов " + hours + " Минут" + minutes + " Секунд " + seconds);
    }
}
