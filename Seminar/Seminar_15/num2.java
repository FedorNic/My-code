package Seminar.Seminar_15;

import java.util.Arrays;

public class num2 {


    public static void main(String[] args) {
        int[] arr1 = null;
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arrSum = sumOfArr(arr1, arr2);
        System.out.println(Arrays.toString(arrSum));
    }

    private static int[] sumOfArr(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            System.out.println("all ok");
            throw new RuntimeException("Some array is null");
        }
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Arrays length isn't equal");
        }
        int[] arr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i] + arr2[i];
        }
        return arr;
    }
}
