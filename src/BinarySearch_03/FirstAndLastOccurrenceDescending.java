package BinarySearch_03;

public class FirstAndLastOccurrenceDescending {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 5, 4, 4, 4, 3, 3, 2, 2, 1};
        int target = 4;

        int firstIdx = findFirst(arr, target);
        int lastIdx  = findLast(arr, target);

        if (firstIdx != -1) {
            System.out.println("First occurrence at index: " + firstIdx);
            System.out.println("Last  occurrence at index: " + lastIdx);
        } else {
            System.out.println("Target not found");
        }
    }

    // ── First Occurrence (leftmost) ───────────────────────────────────
    static int findFirst(int[] arr, int target) {
        int low = 0, high = arr.length - 1, idx = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] < target) {
                high = mid - 1;        // target is in LEFT half
            } else if (arr[mid] > target) {
                low = mid + 1;         // target is in RIGHT half
            } else {
                idx  = mid;
                high = mid - 1;        // keep searching LEFT
            }
        }
        return idx;
    }

    // ── Last Occurrence (rightmost) ───────────────────────────────────
    static int findLast(int[] arr, int target) {
        int low = 0, high = arr.length - 1, idx = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] < target) {
                high = mid - 1;        // target is in LEFT half
            } else if (arr[mid] > target) {
                low = mid + 1;         // target is in RIGHT half
            } else {
                idx = mid;
                low = mid + 1;         // keep searching RIGHT
            }
        }
        return idx;
    }
}
