package Lection.Lection_1;

public class quest {
     public static void main(String[] args) {
         int s = 123;
         s = s-- - --s; //s = 123 - 122 ?? Почему = 2
         System.out.println(s);
     }
 }

// import java.util.Scanner;

// public class quest {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         // System.out.printf("name : ");
//         // String name = iScanner.nextLine();
//         // System.out.printf("Привет, %s!", name);
//         System.out.printf("int a :  ");
//         int x = iScanner.nextInt();
//         System.out.printf("double a :  ");
//         double y = iScanner.nextDouble();
//         double z = (double)x+y;
//         System.out.printf("%d + %f = %f", x, y, z);
//         iScanner.close();
//     }
// }