package Seminar.Seminar_2;// 3. Вывести массив всех чисел в заданном интервале, которые делятся на сумму цифр этого числа

import java.util.Arrays;

public class Seminar_2_3 {
    public static void main(String[] args) {

        int sum_of_digit = 0;
        int num;
        String arr = "";
        for (int index = 11; index < 51; index++) { // Интервал значений от 11 до 50
            num = index;    // Буферная переменная
            while (num > 0) {
                sum_of_digit += num % 10;
                num = num / 10;
            }
            if (index % sum_of_digit == 0) {
                arr += index + " "; //Метка для резки сплитом 
            }
            sum_of_digit = 0;
        }
        String[] result = arr.split(" ");  //Резка строки по метке на отдельные строки и запаковка в массив
        System.out.println(Arrays.toString(result));
    }
}