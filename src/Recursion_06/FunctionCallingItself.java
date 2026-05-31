package Recursion_06;
import java.util.Scanner;

public class FunctionCallingItself {
//    public void main(String[] args) {
//        ajay(1);
//    }
//    public void ajay(int n){
//        if(n==10) return ;
//        System.out.println("Payal");
//        ajay(n+1);
//    }
//public static void main(String[] args) {
//    print(5);
//}
//    public static void print(int n){
//        if(n==0) return ;
//        System.out.println(n);
//        print(n-1);
//    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
       int n = sc.nextInt();
       print(n);
    }
    public static void print(int n){
        if(n==0) return ;
        System.out.println(n);
        print(n-1);
    }
}
