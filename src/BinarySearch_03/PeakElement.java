package BinarySearch_03;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4, 3, 2};
        int result = peakElement(arr);
        System.out.println("Peak element found at index: " + result);
        System.out.println("Peak element value: " + arr[result]);
    }

    public static int peakElement(int[] arr) {
        int n = arr.length;

        // Single element
        if (n == 1) return 0;

        // First element is peak
        if (arr[0] > arr[1]) return 0;

        // Last element is peak
        if (arr[n - 1] > arr[n - 2]) return n - 1;

        // Binary Search on middle elements
        int low = 1, high = n - 2;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;                  // peak found ✅
            } else if (arr[mid] > arr[mid - 1]) {
                low = mid + 1;               // slope going UP → peak on RIGHT
            } else {
                high = mid - 1;              // slope going DOWN → peak on LEFT
            }
        }

        return -1;
    }
}