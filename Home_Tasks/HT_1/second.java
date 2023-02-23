package Home_Tasks.HT_1;
// 2. Написать программу возрващающую число, которе без остатка делится на сумму цифр этого числа (132).

import java.util.Random;

public class second {

    public static int Random() {
        Random r = new Random();
        int num = r.nextInt((200 - 10) + 1) + 10; // Случайное число от 10 до 200
        return num;
    }

    public static boolean Calc() {
        int sum_of_digit = 0, number, num;
        num = Random();
        number = num;
        while (num > 0) {
            sum_of_digit += num % 10;
            num = num / 10;
        }
        if (number % sum_of_digit == 0) {
            System.out.println(number);
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {

        while (Calc() == true) { // Бесконечный цикл с выходом при условии "number%sum_of_digit == 0"
        }
    }
}