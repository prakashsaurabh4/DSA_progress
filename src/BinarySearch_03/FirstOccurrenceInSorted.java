package BinarySearch_03;

public class FirstOccurrenceInSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,4,4,5,5,6,7,8,9,10};
        int target = 4;
        int low = 0,idx = -1;
        int high = arr.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > target) {
                high = mid - 1;
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                idx = mid;
                high = mid - 1;

            }
        }

        if (idx != -1) {
        System.out.println("Found at index " + idx);
        }
        else {
            System.out.println("No found at index ");
        }
    }
}
