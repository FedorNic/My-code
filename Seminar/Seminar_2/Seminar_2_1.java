package Seminar.Seminar_2;// 1. Определение является ли строка полиндромом

public class Seminar_2_1 {
    public static void main(String[] args) {
        func(args);
    }

    public static void func(String[] args) {
        String poly = "1asddsa1";
        int count = 0;
        int i = poly.length()-1;
        for (int index = 0; index < poly.length()/2; index++) {
            if (poly.charAt(index)==poly.charAt(i)) {
                count+=1;
            i-=1;
            }
        }
        if (poly.length()/2==count) System.out.println("Является");
        else System.out.println("Не является");
    }  
}