package SandBox;

import SandBox.Cup.CoffeCup;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SandBox {

    public static void main(String[] args) {
        int sum = 0, num;
        boolean x = true;
        Scanner sc = new Scanner(System.in);
        while (x) {
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                sum += num;
            }
            if (sc.nextLine().equals("ENTER")) {
                System.out.println(sum);
                x = false;
            }
        }
        sc.close();
    }
}
//        CoffeCup teaCoffeCup = new CoffeCup(500, 1, 350, "White", false);
//        CoffeCup sddg = new CoffeCup();
//        CoffeCup coffeCup = new CoffeCup(200, 1, 250, "Black", false);
//
//        System.out.println(sddg.getWeight());
//        System.out.println("Цвет чашки - " + sddg.getColor());
//        System.out.println(CoffeCup.count);
//
//    }


//    public static final String ODD = "Нечётный";
//    public static final String EVEN = "Чётный";
//    public static String[] strings = new String[5];
//public static void main(String[] args) {
// TreeMap<Integer, String> pq = new TreeMap<>();
// pq.put(1, "Vattany");
// pq.put(2,"Hello");
// pq.put(3,"Tree");
// pq.put(4,"World");
// pq.put(5,"Tits");
// System.out.println(pq);
// TreeMap<Integer, String> arr = new TreeMap<>();
// arr.put(1, "Vattany");
// arr.put(2,"Hello");
// arr.put(3,"Tree");
// arr.put(4,"World");
// arr.put(5,"sdfsd");

// int[] arr = new int[] { 1, 2, 3 };
// for (String item : pq) {
// pq.remove(item);
// System.out.println(item);
// pq.remove("Hello");
// System.out.println(pq.contains("Hello"));
// pq.putAll(arr);
// System.out.println(pq);
// System.out.println(pq.descendingKeySet());
// System.out.println(pq);
// for(HashMap.Entry<Integer, String> entry: pq.entrySet()) {
// // Integer key = entry.getKey(); // get key
// // String value = entry.getValue(); // get value
// System.out.printf("[%d: %s]\n", entry.getKey(), entry.getValue());

//        for (int i = 0; i < 5; i++)
//        {
//            if (i % 2 == 0)
//                strings[i] = EVEN;
//            else
//                strings[i] = ODD;
//        }
//        System.out.print("index = 0");
//        System.out.println(" value = " + strings[0]);
//        System.out.print("index = 1");
//        System.out.println(" value = " + strings[1]);
//        System.out.print("index = 2");
//        System.out.println(" value = " + strings[2]);
//        System.out.print("index = 3");
//        System.out.println(" value = " + strings[3]);
//        System.out.print("index = 4");
//        System.out.println(" value = " + strings[4]);
//    }
//}

// ArrayList<String> list1 = new ArrayList<String>();
// list1.add("e");
// list1.add("d");
// list1.add("Привет");
// list1.add("Hello");
// list1.add("Hola");
// list1.add("Bonjour");
// list1.add("Cialo");
// list1.add("Namaste");
// System.out.println(list1);
// Collections.reverse(list1);;
// System.out.println(list1);
// ArrayList<String> listCopy = new ArrayList(list1);

// for (String str: listCopy) {
// if (str.equals("Hello"))
// list1.remove(str);
// }

// System.out.println(list1);
// System.out.println(listCopy);

// ArrayList<String> list = new ArrayList<String>();

// list.add("Привет");
// list.add("Hello");
// list.add("Hola");
// list.add("Bonjour");
// list.add("Cialo");
// list.add("Namaste");

// for (String str: list)
// {
// if (str.equals("Hello"))
// list.remove(str);
// }

// System.out.println(pq.toString());
// System.out.println(pq);
