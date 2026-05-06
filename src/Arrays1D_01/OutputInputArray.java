package Arrays1D_01;

import java.util.Scanner;

public class OutputInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//       int[] arr = {5,-8,2,67,43,-97};
//        // System.out.println(arr.length);   size of array
//       for(int i=0;i<arr.length;i++) {
//           System.out.print(arr[i]+" ");
//       }

        int[] saurabh = new int[7]; //Default value
//        for(int i=0;i<saurabh.length;i++) {
//            System.out.print(saurabh[i]+" ");
        //}

        //Input
        System.out.println("Enter array elements: ");
        for(int i=0;i<7;i++){
            saurabh[i]=sc.nextInt();
        }
        //Print
        for(int i=0;i<7;i++)

    {
        System.out.print(saurabh[i]+" ");
    }

    }
}
