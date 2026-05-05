package Arrays_01;

import java.util.Arrays;

public class SortArrayBuiltIn {
    static void main(String[] args) {
        // sort - Ascending Order
        int[] arr = {4,1,7,8,9,-3,-9};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
