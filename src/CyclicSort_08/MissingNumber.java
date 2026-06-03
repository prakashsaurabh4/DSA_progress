package CyclicSort_08;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {

        // ✅ Local class — no 'public' keyword
        class Solution {
            int missingNum(int[] arr) {
                int i = 0;
                int n = 1 + arr.length;
                while (i < arr.length) {
                    if (arr[i] == i + 1 || arr[i] == n)
                        i++;
                    else {
                        int idx = arr[i] - 1;
                        swap(arr, i, idx);
                    }
                }
                for (i = 0; i < arr.length; i++) {
                    if (arr[i] != i + 1)
                        return i + 1;
                }
                return n;
            }

            private void swap(int[] arr, int i, int idx) {
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }

        // ✅ Scanner logic directly in main — no second class needed
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements (range 1 to " + (size + 1) + ", one missing):");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int result = sol.missingNum(arr);
        System.out.println("Missing number: " + result);

        sc.close();
    }
}