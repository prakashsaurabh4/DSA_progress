package Arrays_01;

import java.util.Arrays;

public class RotateAnArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;

        System.out.println("Before Rotation: " + Arrays.toString(arr));
        rotateArr(arr, d);
        System.out.println("After Rotation:  " + Arrays.toString(arr));
    }

    static void rotateArr(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}