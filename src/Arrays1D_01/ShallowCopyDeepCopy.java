package Arrays1D_01;

import java.util.Arrays;

public class ShallowCopyDeepCopy {
    static void main(String[] args) {
        int[] arr = {10,20,30,40};
//        int[] x =  arr; //x is shallow copy of arr
//        x[0] = 100;
//        System.out.println(arr[0]);

        int[] y = Arrays.copyOf(arr, arr.length); //Deep Copy
        y[0] = 100;
        System.out.println(y[0]);
        System.out.println(arr[0]);
    }
}
