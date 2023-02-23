package Seminar.Seminar_10;

import java.util.ArrayList;
import java.util.List;

public class Example2 {
    public static class Fruit {
        public int weight() { return 5; }
    }
    public static class Apple extends Fruit {
        @Override
        public int weight() { return 1; }
    }
    public static class Orange extends Fruit {
        @Override
        public int weight() { return 2; }
    }
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple());
        apples.add(new Apple());
        apples.add(new Apple());
        System.out.println(overallWeight(apples));

        List<Orange> oranges = new ArrayList<>();
        oranges.add(new Orange());
        System.out.println(overallWeight(oranges));

        List<Fruit> citrusFruits = new ArrayList<>();
        citrusFruits.add(new Fruit());
        System.out.println(overallWeight(citrusFruits));
    }
    public static int overallWeight(List<? extends Fruit> fruits) {
    // Универсальный и безопасный метод для обработки (без добавления) всех потомков Fruit (Apple, Orange) и самих Fruit
    //При List fruits доступ к добавлению внутри метода будет открыт, и это потенциальная угроза невалидных данных
        int sum = 0;
        for (Fruit fr : fruits) {
            sum += fr.weight();
        }
        return sum;
    }
}