package Seminar.Seminar_3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Seminar_3_1_1 {

    public static Integer count(List<String> start, String element) {
        int count = 0;
        for (String string : start) {
            if (element.equals(string)) {
                count++;
            }
        }
        return count;
    }

    public static Map<String, Integer> transformer(List<String> start) {
        Map<String, Integer> collection = new HashMap<>();
        for (String string : start) {
            collection.put(string, count(start, string));
            // Можно было бы функцию count не писать, а воспользоватся готовой frequncy
        }
        return collection;
    }

    public static void main(String[] args) {
        List<String> collection = Arrays.asList("Поле", "Лес", "Дорога", "Поле");
        for (Map.Entry<String, Integer> buf : transformer(collection).entrySet()) {
            System.out.println(buf.getKey() + " = " + buf.getValue());
        }
    }
}