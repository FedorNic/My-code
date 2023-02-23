package Seminar.Seminar_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Example3 {
    public static abstract class Fruit {
        public abstract int weight();
    }
    public static class Apple extends Fruit {
        @Override
        public int weight() {return 1; }
    }
    public static class Orange extends Fruit {
        @Override
        public int weight() {return 2; }
    }
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Apple());
        fruits.add(new Orange());
        putRandomFruits(fruits);
        System.out.println(fruits);
        putRandomFruits(new ArrayList<Fruit>());    // родительские допускаются, дочерние - нет
        putRandomFruits(new ArrayList<Object>());    //родительские допускаются, дочерние - нет
    }
    public static void putRandomFruits(List<? super Fruit> dest) {
// <? super Fruit> означает, что в метод можно передать список Fruit или его родителя - Обджект,
// а дочерние (Apple и Orange) – нет. Контрвариантность. При этом возможно добавление в список дочерних классов
        Random rnd = new Random();
        for (int i = 0; i < 5; i++) {
            if (rnd.nextBoolean()) {
                dest.add(new Apple());
            } else {
                dest.add(new Orange());
            }
        }
    }
}