package SandBox.Sumtest;

import java.util.Scanner;

public class Final implements Summer, Minus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Num first = new Num(scanner.nextInt());
        Num second = new Num(3);
        System.out.println(Summer.summer(first, second));
        System.out.println(Minus.minus(first, second));
    }
}
