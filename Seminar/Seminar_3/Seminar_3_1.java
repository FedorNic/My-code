package Seminar.Seminar_3;
// 1. Дан список из 10 - 20 слов с повторами,
// вывести этот же спиок без повторов и указать сколько раз оно встречалось до изменения.

import java.util.ArrayList;
import java.util.Collections;

public class Seminar_3_1 {
    public static void main(String[] args) {
        ArrayList<String> start = new ArrayList<>();
        start.add("Поле");
        start.add("Лес");
        start.add("Дорога");
        start.add("Река");
        start.add("Пыль");
        start.add("Дорога");
        start.add("Поле");
        start.add("Дождь");
        start.add("Река");
        start.add("Поле");
        System.out.println(start);

        Collections.sort(start); //функция сортировки 
        System.out.println(start);

        int count = 1;
        for (int index = 1; index < start.size(); index++) {
            if (index == start.size() - 1) { // Последний символ в строке
                count += 1;
                System.out.print(start.get(index) + " " + count);
            } else if (start.get(index - 1) == start.get(index)) { // Символы совпадают
                count += 1;
            } else { // // Символы не совпадают или не последний символ строки
                System.out.print(start.get(index - 1) + " " + count + " ");
                count = 1; // Обнуляем счетчик
            }
        }
    }
}
