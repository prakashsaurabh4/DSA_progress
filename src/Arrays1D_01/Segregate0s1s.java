package Arrays1D_01;

public class Segregate0s1s {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 0, 1, 1, 0};

        int numberOfZeros = 0;
        int numberOfOnes = 0;

        // Count
        for (int x : arr) {
            if (x == 0) numberOfZeros++;
            else numberOfOnes++;
        }

        // Fill 0s
        for (int i = 0; i < numberOfZeros; i++) {
            arr[i] = 0;
        }

        // Fill 1s — Bug 1 Fixed: start from numberOfZeros, not 0
        for (int i = numberOfZeros; i < arr.length; i++) {
            arr[i] = 1;
        }

        // Print — Bug 2 Fixed: loop through array, i is out of scope outside loop
        System.out.print("After: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}