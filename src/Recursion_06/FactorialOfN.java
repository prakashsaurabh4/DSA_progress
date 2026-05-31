package Recursion01_06;

import java.util.Scanner;

public class FactorialOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int result = factorial(n);

        System.out.println("Factorial = " + result);

    }
        static int factorial(int n) {
            // code here
            if(n==0 || n==1) return 1;
            int ans = n*factorial(n-1);
            return ans;

        }
    }

