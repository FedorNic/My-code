package Seminar.Seminar_9;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

// Конструктор принимает диапазон значений (1-10) и выдает их на экран
public class IterableIterator implements Iterable<Integer> {

    private final int start;
    private final int end;

    public IterableIterator(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {    //Анонимный класс (так как от интерфейса)
            private int counter = start;    //Поле анонимного класса

            @Override
            public boolean hasNext() {
                return counter <= end;
            }

            @Override
            public Integer next() {
                return counter++;
            }
        };
    }

    public static void main(String[] args) {
        IterableIterator iterator = new IterableIterator(1, 10);
        for (Integer integer : iterator) {
            System.out.println(integer);
        }
    }
}