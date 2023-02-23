package Seminar.Seminar_10;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

    public static void main(String[] args) {
//        Number[] num = new Integer[];   //Наследование в массивах возможно
//        List<Number> list = new ArrayList<Integer>();   //Наследование в списках не возможно
        List<Integer> list = new ArrayList<>();
        sumArray(list);
    }
    public static void sumArray(List<? extends Number> numbers){
    // <? extends Number> означает, что в метод можно передать список Number или его потомков – Integer, Double итд, ? а родителя Обджект – нет ?.
    // Применяется для получения универсального метода, подходящего для любого потомка класса Number, но только БЕЗ ОПЕРАЦИИ ДОБАВЛЕНИЯ
    // Компилятор не пропустит, чтобы например в список целых чисел случайно не добавить float (защита от дурака).

    // При использовании List <Number>numbers компилятор пропустит, только если в метод будут добавлять числа Number,
        // все другие типы – нет (дженерики //инвариантны).

    // При использовании List numbers без дженерика компилятор пропустит, и в методе можно будет добавлять любые числа,
        // но это потенциальная ошибка (в списке //из int добавим float).

        numbers.add(null); //можно добавить только null
//        numbers.add(12);  // нельзя
//        numbers.add(1f);  //  так совсем нельзя =)
//        System.out.println(numbers);
        for (Number num: numbers) {
            System.out.println(num);

// Можно перебрать, распечатать, сложить, итд НО НЕ ДОБАВИТЬ
            //for (int index = 0; index < numbers.size(); index++) {
            //numbers.add(5);
            // index++;
            // }
        }
    }
}