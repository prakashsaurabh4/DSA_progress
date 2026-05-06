package Arrays1D_01;

public class SortInWaveArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        // Print before
        System.out.print("Before: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i += 2) {
            if (i == arr.length - 1) break; // for odd length array
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        System.out.print("After: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
