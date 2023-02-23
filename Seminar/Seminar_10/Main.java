package Seminar.Seminar_10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static abstract class Fruit {
        public abstract int weight();
    }
    public static abstract class CitrusFruit extends Fruit {
    }
    public static class Apple extends Fruit {
        @Override
        public int weight() {return 1;}
    }
    public static class Orange extends CitrusFruit {
        @Override
        public int weight() {return 3;}
    }
    public static class Mandarin extends CitrusFruit {
        @Override
        public int weight() {return 3;}
    }
    public static void main(String[] args) {
        List<CitrusFruit> citrusFruits = new ArrayList<>();
        citrusFruits.add(new Mandarin());
        citrusFruits.add(new Orange());
        List<Fruit> fruits = new ArrayList<>();
        List<Orange> oranges = new ArrayList<>();
        moveSomeFruits(oranges, citrusFruits, 20);
    }

    public static <T extends Fruit> void moveSomeFruits(List<? extends T> source, List<? super T> dest, int maxWeight) {
        // Из исходного списка перекладываем в конечный пока не наберем maxWeight
        //<? super T> значит, что какой-то тип Т можноскопировать только в какой-то родительский тип
        //например Integer в Number.
        int w = 0;
        for (T fr : source) {
            w += fr.weight();
            if (w <= maxWeight) {
                dest.add(fr);
            }
        }
    }
}