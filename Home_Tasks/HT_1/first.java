package Home_Tasks.HT_1;
// 1. Написать программу вычисления n-ого треугольного числа
import java.util.Scanner;

public class first {
    public static void main(String[]args){
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите целое число n, начиная от 1");
        System.out.println("Я сделаю из него треугольное =)");
        int n = iScanner.nextInt();
        if (n<1) System.out.println("Прочитай условие еще раз и начни сначала");
        else System.out.println("Треугольное число = " + n*(n+1)/2);
        iScanner.close();
    }
}
