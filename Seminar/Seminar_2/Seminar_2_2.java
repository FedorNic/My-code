package Seminar.Seminar_2;// 2. Сократить строку вида aaabbbssskkk до a3b3s3k3

public class Seminar_2_2 {
    public static void main(String[] args) {
        String s = "aaaaabbskkkk";
        int count = 1;
        for (int index = 1; index < s.length(); index++) {
            if (index == s.length() - 1) {  // Последний символ в строке
                count += 1;
                System.out.print(s.charAt(index) + "" + count);
            } else if (s.charAt(index - 1) == s.charAt(index)) {    // Символы совпадают
                count += 1;
            } else {    // // Символы не совпадают или не последний символ строки
                System.out.print(s.charAt(index - 1) + "" + count);
                count = 1;  // Обнуляем счетчик
            }
        }
    }
}
