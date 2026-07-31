package OOPS_08;

public class MaxUsingConstructor {
    public static int max(int a,int b){
        return Math.max(a,b);

    }
    public static int max(int a,int b,int c){

        return Math.min(a,Math.max(b,c));
    }
    public static void main(String[] args) {
        System.out.println(max(5,7));
        System.out.println(max(5,6,7));

    }
}
