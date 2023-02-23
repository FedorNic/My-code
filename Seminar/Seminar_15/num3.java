package Seminar.Seminar_15;

public class num3 {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8}};
        checkArr(arr);
    }

    private static void checkArr(int[][] arr) {
        if (arr == null) {
            throw new RuntimeException("Array is null");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr.length != arr[i].length) {
                throw new RuntimeException("Line not equals row");
            }
        }
    }
}