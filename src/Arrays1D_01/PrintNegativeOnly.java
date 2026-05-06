package Arrays1D_01;

import java.util.Scanner;

public class PrintNegativeOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        //Printing negative value
        for(int i = 0; i < n; i++)
            if(arr[i] < 0)
            System.out.print(arr[i] + " ");

    }
}
