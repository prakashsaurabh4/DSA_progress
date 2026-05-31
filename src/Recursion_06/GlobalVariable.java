package Recursion01_06;

public class GlobalVariable {

    //Local Variable
//    public static void main(String[] args) {
//        int x = 10;
//        System.out.println(x);
//
//    }
//
//    public static void fun(int x){
//        x = 20;
//
//    }


    //Global Variable
    static int x = 10;
    public static void main(String[] args) {
     fun();
     System.out.println(x);
     int x = 8;
        System.out.println(x);
     x = 2;
     System.out.println(x);
    }
    public static void fun(){
        x=20;

    }
}
