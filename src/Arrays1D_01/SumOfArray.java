package Arrays1D_01;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the array:");
        int arr[]=new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        //Printing sum value
        int sum=0;
        for(int i = 0; i < n; i++)
            sum +=arr[i];
                System.out.print(sum);

    }
}
