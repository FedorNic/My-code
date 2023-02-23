package SandBox;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class BenchMark {

    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 5_000_000; i++) {
            linkedList.add(i);
        }

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            linkedList.add(2_000_000, new Integer(Integer.MAX_VALUE));
        }
        System.out.println("Время работы для LinkedList (в милисекундах) = " + (System.currentTimeMillis() - start));


        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 5_000_000; i++) {
            arrayList.add(new Integer(i));
        }

        long start1 = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            arrayList.add(2_000_000, new Integer(Integer.MAX_VALUE));
        }
        System.out.println("Время работы для ArrayList (в миллисекундах) = " + (System.currentTimeMillis() - start1));
    }
//
//
//
//        public static long getTimeMsOfInsert(List list) {
//            //напишите тут ваш код
//            Date currentTime = new Date();
//            insert1000000(list);
//            Date newTime = new Date();
//            long msDelay = newTime.getTime() - currentTime.getTime(); //вычисляем разницу
//            System.out.println("Результат в миллисекундах: " + msDelay);
//            return msDelay;
//
//        }
//
//        public static void insert1000000(List list) {
//            for (int i = 0; i < 1000000; i++) {
//                list.add(0, new Object());
//            }
//        }

}