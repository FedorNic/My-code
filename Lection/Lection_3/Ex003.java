package Lection.Lection_3;

import java.util.ArrayList;

public class Ex003 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>(); //Записываем Integer для избежания ошибок 
        //(напимер попадут данные типа String) - будет ошибка
        ArrayList<Integer> list2 = new ArrayList<>();   //Второй раз писать не обязательно
        ArrayList<Integer> list3 = new ArrayList<>(10); //Выделение сразу 10 элементов
        ArrayList<Integer> list4 = new ArrayList<>(list3);  //Копирование листов
        System.out.println(list3);
        list3.add(123);
        System.out.println(list4);

    }
}
