package BinarySearch_03;

public class FloorInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int x = 11;

        int result = findFloor(arr, x);

        if (result != -1) {
            System.out.println("Floor of " + x + " is at index: " + result);
            System.out.println("Floor value: " + arr[result]);
        } else {
            System.out.println("No floor found for " + x);
        }
    }

    public static int findFloor(int[] arr, int x) {
        int n = arr.length;
        int low = 0, high = n - 1, idx = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > x) {
                idx = mid;
                high = mid - 1;       // too big → go LEFT
            } else {
                idx = mid;            // arr[mid] <= x → valid floor
                low = mid + 1;        // find larger candidate → go RIGHT
            }
        }

        return idx;
    }
}