package Lection.Lection_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.IntStream;

import javax.lang.model.util.Types;

// public class program {      // определение типа в неявной переменной
//     public static void main(String[] args) { //Точка старта программы
//         //System.out.println("Hello world");
//         var s = 123;
//         System.out.println(getType(s));
//     }
//     static String getType(Object o) {
//         return o.getClass(). getSimpleName();
//     }
// }

// Сниппеты - class, main, sysout

// public class program {
//     public static void main(String[] args) {
//         int s = 123;
//         s = s-- - --s; //s = 123 - 122 ?? Почему = 2
//         System.out.println(s);
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         boolean s = 123 >= 124; //Двойное неравенство?

//         System.out.println(s);
//     }
// }

//        String s = "qwer";
//        s.charAt(1) - обращение к первому символу строки
//        s.lenght() - длина массива
//        int[] arr = new int[10]
//        int[] arr = {1,2,3,4,5,6,7,8,9,10}

// public class program {
//     public static void main(String[] args) {
//         int[] arr[] = new int [3][5];
//             for (int[] line:arr) {
//                 for (int item:line) {
//                  item = 13;          //Такая замена переменных в for in не работает
//                     System.out.printf("%d", item);
//                 }
//             System.out.println();
//         }
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         int[] arr[] = new int [3][5];
//             for (int i = 0; i < arr.length; i++) {
//                 for (int j = 0; j < arr[i].length; j++) {   //arr[i].length = 5 в данном случае
//                     System.out.printf("%d", arr[i][j]);
//                 }
//             System.out.println();
//         }
//     }
// }

// Преобразование

// public class program {
//     public static void main(String[] args) {
//        // Не явное преобразование (автоматическое, расширяющее)
//        int i = 123_125_47;   //4 байта
//        double d = i;   //8 байт

//        System.out.println(i);   //123
//        System.out.println(d);   //123.0
//        // Явное преобразование "есть - ()" (сужающее)
//        int r = 123;
//        double m = (double)r;
//        System.out.println(r);   //123
//        System.out.println(m);   //123.0
//     }
// }

//  import java.util.Scanner;

//  public class program {
//      public static void main(String[] args) {
//          Scanner iScanner = new Scanner(System.in);
//          // System.out.printf("name : ");
//          // String name = iScanner.nextLine();
//          // System.out.printf("Привет, %s!", name);
//          System.out.printf("int a :  ");
//          int x = iScanner.nextInt();
//          System.out.printf("double a :  ");
//          double y = iScanner.nextDouble();
//          double z = (double)x+y;
//          System.out.printf("%d + %f = %f", x, y, z);     //%d - int, %f - double, %s - string
//          iScanner.close();
//      }
//  }

// Проверка на соответствие типу
// import java.util.Scanner;

// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a :  ");
//         boolean flag = iScanner.hasNextInt();   //
//         System.out.println(flag);               //  Тело проверки
//         int i = iScanner.nextInt();
//         System.out.println(i);
//         iScanner.close();
//     }
// }

// Форматированный вывод
// public class program {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         String res = a + "+" + b + "=" + (a+b);
//         System.out.println(res);
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c = a+b;
//         String res = String.format("%d+%d=%d", a,b,c);  // String.format, если хотим куда-то положить
//         System.out.println(res);                        //
//         System.out.printf("%d+%d=%d", a,b,c);
//     }
// }

// Функции
// public class program {
//     public static void say_hi() {
//         System.out.println("Hi! =)");
// }
//     static int sum(int a, int b) {
//         return a+b;
// }
//     static double factor(int a) {
//         if (a==1) return 1;
//         return a*factor(a-1);
// }
//     public static void main(String[] args) {
//         say_hi();                               // Hi!
//         System.out.println(sum(1, 3));     // 4
//         System.out.println(factor(5));        // 120
// }
// }

// Условный оператор

// public class program {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c;
//         if (a>b) {
//             c = a;
//         }
//         else {
//             c = b;
//         }
//         System.out.println(c);
//     }
// }

// Тернарный оператор
// public class program {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int min = a<b ? a:b;
//         System.out.println(min);    // Если a<b, выполняется левая часть до ":", если нет - правая.
//     }
// }

// Оператор выбора
// public class program {
//     public static void main(String[] args) {
//         int mounth = 2;
//         String text = "";
//         switch (mounth) {    // переменная для проверки
//             case 1:          // значение переменной для проверки
//             text = "Autumn";
//             break;
//             case 2:          // значение переменной для проверки
//             text = "Summer";
//             break;
//         default:
//             text = "mistake";
//             break;
//         }
//         System.out.println(text);
//     }
// }

//Циклы

//While
// public class program {
//     public static void main(String[] args) {
//         int a = 321;
//         int count = 0;
//         while (a!=0) {
//             a /= 10;
//             count++;
//         }
//         System.out.println(count);
//     }
// }

// Do while (с постусловием)
// public class program {
//     public static void main(String[] args) {
//         int a = 321;
//         int count = 0;
//         do {
//             a /= 10;
//             count++; 
//         } while (a!=0);
//         System.out.println(count);
//     }
// }

//For
// public class program {
//     public static void main(String[] args) {
//         for (int index = 0; index < 10; index++) {
//             if (index%2==0) continue;       // Цикл не переходит дальше, а возвращается к новому индексу
//             // break                        // Завершает цикл принудительно
//             System.out.println(index);       //continue и break стараться не использовать!!!
//         }
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         for (int index = 0; index < 5; index++) {
//             for (int j = 0; j < 5; j++) {
//                 System.out.print("* ");
//             }
//         System.out.println();
//         }
//     }
// }

// public class program {
//     public static void main(String[] args) {
// int[] arr = int[] {1,2,3,4,5};
// for(int item:arr) {
//     System.out.println(item);       // распечатка массива посимвольно
// }
//         for (int index = 0; index < 5; index++) {
//             for (int j = 0; j < 5; j++) {
//                 System.out.print("* ");
//             }
//         System.out.println();
//         }
//     }
// }
/**
 * program
 */

// public class program {
// public static void main(String[] args) {
    
//     int[] array = new int[100000];
//     Integer[] array1 = new Integer[100_000];
//     Integer[] array2 = new Integer[100_000];
//     Random r = new Random();
//         for (int i = 0; i < array.length; i++) {
//             array[i] = array1[i] = array2[i] = r.nextInt();}
//  int[] array = { 10, 2, 10, 3, 1, 2, 5 };
//  long startTime, endTime;
//  System.out.println(Arrays.toString(array));
//  Arrays.fill(array, 2, 5, 54);
//  System.out.println(Arrays.toString(array));
//  int [] newArrays = Arrays.copyOf(array, 3);
//  System.out.println(Arrays.toString(newArrays));
// // System.out.println(Arrays.toString(array));
// startTime = System.nanoTime();
// Arrays.sort(array);
// endTime = System.nanoTime();
// System.out.println((endTime - startTime) / 1000);
// startTime = System.nanoTime();
// Arrays.sort(array1);
// endTime = System.nanoTime();
// System.out.println((endTime - startTime) / 1000);
// startTime = System.nanoTime();
// Collections.sort(Arrays.asList(array2));
// endTime = System.nanoTime();
// System.out.println((endTime - startTime) / 1000);
// // int n = Arrays.binarySearch(array, -11);
// // if (n < 0)
// // System.out.println("Такого значения нет");
// // Integer i = 682;
// // Double d = 2.33;
// // Boolean b = false;
// // System.out.println(i+i);
// // System.out.println(d);
// // System.out.println(b);
// // String s = i.toString();
// // System.out.println(s.getClass(). getSimpleName());
// // Integer n = Integer.parseInt(s+s);
// // System.out.println(n.getClass(). getSimpleName());
// // n += n;
// // System.out.println(n);
// // int [][] twoDimArray = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};
// // System.out.println(Arrays.deepToString(twoDimArray));
// String[] seasons = new String[] {"Winter", "Spring", "Summer", "Autumn"};
// System.out.println(Arrays.toString(seasons));
// }
// }

// public class program {
//     static int n = 130;

//     public static void main(String[] args) {
//         //int n = 250;
//         System.out.println(n);
//         {
//             n = 123;
//             System.out.println(n);
//         }
//         name(n);
//         System.out.println(n);
//     }

//     public static int name(int n) {
//         {
//             n = 435;
//         }
//         System.out.println(n);
//         n = 200;
//         System.out.println(n);
//         return n;
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         int[] intArray = IntStream.range(1, 11).toArray();
//         System.out.println(Arrays.toString(intArray));
//         int[] seasons  = new int[11];
//         for (int index = 1; index < seasons.length; index++) {
//             seasons[index] = index;
//         }
//         System.out.println(Arrays.toString(intArray));
//     }
// }

public class program {
    public static void main(String[] args) {

        }
    }
