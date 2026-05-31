package Recursion_06;

import java.util.ArrayList;

public class StringInrecursion {
    public static void main(String[] args) {
        String s = "kartikey";
//        change(s);
//        System.out.println(s);

        String[] arr = {"Santosh", "krish", "Hemant","Preet"};
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//      }


            ArrayList<String> al = new ArrayList<>();
            al.add("Sharvan");
            al.add("Umanq");
            al.add("Ayan");
            al.add("Shelly");
            al.add("Riya");
            System.out.println(al);
            change2(al);
        System.out.println(al);
    }

    private static void change2(ArrayList<String> al){
        al.add("Biplav");
    }

    public static void change(String s){
        s = "Lavish";
    }
}
