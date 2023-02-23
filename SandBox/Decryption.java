package SandBox;
/*
Дешифровка с бинарной мутью
 */
public class Decryption {
        public static String msg = "Это сообщение нужно для шифровки";
        public static String encmsg = "";
        public static String decmsg = "";
        public static int key = 88;  //Зная этот ключ и при этом не зная исходное сообщение, можно
        // провести дешифровку!))

        public static void endDecodingMsg() {
            for (int i = 0; i < msg.length(); i++) {              // Проходим циклом по всему тексту, которое нужно зашифровать.
                encmsg = encmsg + (char) (msg.charAt(i) ^ key);   // Вызываем метод charAt(i), который возвращает символы из нашего текста
            }                                                     // которое преобразуется в двоичное и с помощью оператора ^ и ключа 88 изменяется.
            System.out.println("Зашифрованное сообщение:");
            System.out.println(encmsg+"\n");
        }

        public static void decodingVsg() {
            for (int i = 0; i < msg.length(); i++) {                // Проделываем те же манипуляции, что и с шифровкой пользуясь правилом,
                decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);  // "Если выполнить сначала над некоторыми значениями X(msg) и Y(key), а затем над ее
            }                                                       // "результатом(encmsg) и значением Y(88), то мы снова вернем Х(msg)"
            System.out.println("Дешифрованное сообщение:");
            System.out.println(decmsg);
        }

        public static void main(String[] args) {
            System.out.println(msg + "\n");
            endDecodingMsg();
            decodingVsg();
        }
    }