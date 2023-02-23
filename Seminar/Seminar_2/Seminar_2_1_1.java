package Seminar.Seminar_2;

public class Seminar_2_1_1 {
    public static void main(String[] args) {
        if (check("tentt")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean check(String arg) {
        String reversArg = new StringBuilder(arg).reverse().toString(); //Прием строки, разворот 
        //и конвертация обратно в строку. Без StringBuilder не работает .reverse().
        if (reversArg.equals(arg)) {  // Сравнение исходной и перевернутой строки
            return true;
        } else {
            return false;
        }
    }
}
