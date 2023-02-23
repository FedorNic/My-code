package Seminar.Seminar_8;

public class Wheel implements Checkable {
    public void rotate() {
        System.out.println("Колесо крутится");
    }

    @Override
    public void check() {
        System.out.println("Ок");
    }
}