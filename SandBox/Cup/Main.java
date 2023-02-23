package SandBox.Cup;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        Cup coffeCup1 = new CoffeCup(300, 2, 450, "Red", true);
//        Cup coffeCup2 = new CoffeCup();
        coffeCup1.value = 25;
        coffeCup1.sound("jdfghfdk");
        coffeCup1.sound();
        coffeCup1.sound("Crack");
        System.out.println(coffeCup1.getWeight());  //Будет Yellow из-за конструктора
//        System.out.println(coffeCup2.getWeight());
//        System.out.println(coffeCup1.getColor());
//        System.out.println(coffeCup2.getColor());
        System.out.println(CoffeCup.count);
    }
}
