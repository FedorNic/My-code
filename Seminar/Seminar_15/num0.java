package Seminar.Seminar_15;
//Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
//Если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки, иначе - длину массива.

public class num0 {
    static final int INDEX = 12;
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println(findnumberarray(array));;
    }

    /**
     * return if array
     * @param array of int
     * @return
     */
    public static int findnumberarray(int[] array){
        if (array.length < INDEX) {
            return -1;
        }

        return array.length;
    }
}
