package Seminar.Seminar_16;

public class num1 {
    public static void main(String[] args) {
        String[][] strings = {{"1", "2", "3", "1asd", null, "3"}, {"1", "2", "3", "1", "2", "3"}};
        System.out.println(sum2d(strings));
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (String[] strings : arr) {
            try {
                for (int j = 0; j < 5; j++) {
                    int val;
                    try {
                        val = Integer.parseInt(strings[j]);
                    } catch (NumberFormatException | NullPointerException ex) {
                        val = 0;
                        ex.printStackTrace();
                    }
                    sum += val;
                }
            } catch (ArrayIndexOutOfBoundsException ex) {
                throw new RuntimeException("Index out of bound");
            }
        }
        return sum;
    }
}
