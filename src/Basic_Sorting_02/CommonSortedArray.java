package Basic_Sorting_02;

import java.util.ArrayList;
import java.util.Arrays;
public class CommonSortedArray {
    public static void main(String[] args) {
        int[] a = {5, 3, 6, 7, 5, 0, 7, 2};
        int[] b = {3,2,1,5,8,7,4,3};
        // Sort both arrays
        Arrays.sort(a);
        Arrays.sort(b);

        // Two pointer
        int i = 0, j = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                ans.add(a[i]);
                i++;
                j++;
            }
            else if (a[i] < b[j]) {
                i++;
            }
            else {
                j++;
            }
        }

        // Output
        for(int k : ans) {
            System.out.print(k + " ");
        }
    }
}
