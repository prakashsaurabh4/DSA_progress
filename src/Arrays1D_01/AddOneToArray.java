package Arrays1D_01;

//Try another way


public class AddOneToArray {
        public static void main(String[] args) {
            int[] arr = {9, 9, 9};

            System.out.print("Before: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

            int n = arr.length;

            // Start from last digit
            for (int i = n - 1; i >= 0; i--) {
                if (arr[i] < 9) {
                    arr[i] += 1;
                    break;
                }
                arr[i] = 0;
            }

            // Check if all digits were 9 → first element will be 0
            if (arr[0] == 0) {
                int[] result = new int[n + 1];
                result[0] = 1;
                arr = result;
            }

            System.out.print("\nAfter:  ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }