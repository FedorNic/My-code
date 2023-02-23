package Seminar.Seminar_15;
//Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение. Метод ищет в массиве заданное значение
// и возвращает его индекс. При этом, например:
//если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
//если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//если вместо массива пришел null, метод вернет -3

public class num1 {
    static final int MIN_LENGTH = 12;
    public static void main(String[] args) {
        int[] array = new int[10];
        try {
            System.out.println(findindexofnumb(array, 5));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        ;
    }

    public static int findindexofnumb(int[] array, int num) throws Exception {
        if (array == null) {
            try {
                throw new Exception("Array is null");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        if (array.length< MIN_LENGTH) {
            try {
                throw new Exception("Array length is too small");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return i;
            }
        }
        throw new Exception("Num is not found in Array");
    }
}
