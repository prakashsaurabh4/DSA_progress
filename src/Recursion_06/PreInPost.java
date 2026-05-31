package Recursion_06;

public class PreInPost {
    public static void main(String[] args) {
       pip(3);

    }
    public static void pip(int n){
        if(n==0) return;
        System.out.print(n+" "); //Pre
        pip(n-1);
        System.out.print(n+" "); //In
        pip(n-1);
        System.out.print(n+" "); //Post

        // 1-> 1 1 1
        // 2-> 2 1 1 1 2 1 1 1 2
        // 3-> 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3
    }
}
