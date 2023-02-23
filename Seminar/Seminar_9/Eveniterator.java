package Seminar.Seminar_9;

import java.util.Iterator;

public class Eveniterator implements Iterable<Character> {

    public final String str;

    public Eveniterator(String str) {
        this.str = str;
    }

    @Override
    public Iterator<Character> iterator() {
        return new Iterator<Character>() {
            int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < str.length();
            }

            @Override
            public Character next() {
                char ch = str.charAt(counter);
                counter += 2;
                return ch;
            }
        };
    }

    public static void main(String[] args) {
        Eveniterator iter = new Eveniterator("qwertyuiop");
        for (Character ch : iter) {
            System.out.println(ch);
        }
    }
}
