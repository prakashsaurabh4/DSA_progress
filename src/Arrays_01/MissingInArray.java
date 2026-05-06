package Arrays_01;

public class MissingInArray {
    public static int findMissing(int[] arr) {
        long n = arr.length + 1;
        long expectedSum = (long) n * (n + 1) / 2;
        long actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        return (int)(expectedSum - actualSum);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        System.out.println("Missing element: " + findMissing(arr)); // Output: 3
    }
}