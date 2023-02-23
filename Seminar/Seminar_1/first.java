package Seminar.Seminar_1;

// Реализовать функцию возведения числа а в степень b.
// a, b ∈ Z. Сводя количество выполняемых действий к минимуму. 
// Пример 1: а = 3, b = 2, ответ: 9 
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1
// Пример 4: а = 0, b = 0, ответ: не определено
// Пример 5
// входные данные находятся в файле input.txt в виде
// b 3
// a 10
// Результат нужно сохранить в файле output.txt
// 1000


public class first {
    public static void main(String[] args) {
        int a = 3, b = 2, res = 1;
        if (a==0 && b==0) System.out.println("Не определено");        
        else if (b==0) System.out.println(1);
        else if (a>0 && b>0) {
            for (int index = 1; index <= b; index++) {
                res *= a;}
            System.out.println(res);}
        else if (b<0) {
            for (int index = 1; index <= -b; index++) {
                res *= a;}
            System.out.println(1.0/res);}
        }
}


//public static double pow(double num, int pow){

//     if(pow == 0 && num == 0)
//     System.out.println("не определено");

// if(pow == 0 || num == 1){
//     return 1;
// }

// if (pow < 0){
//     pow = -pow;
//     num = 1/num;
// }

// double result = 1;

// for (int i = 0; i < pow; i++) {
//     result *=num;
// }
// return result;
// }
