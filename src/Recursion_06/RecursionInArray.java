package Recursion_06;

public class RecursionInArray {
    public static void main() {
        int[] arr = {5,3,12,76,9,34,5};
        recPrint(arr,0);
    }

    //For starting to last
//    public static void recPrint(int[] arr,int index){
//        if(index==arr.length) return;
//        System.out.print(arr[index]+" ");
//        recPrint(arr,index+1);
//    }


    //In reverse Order
    public static void recPrint(int[] arr,int index){
        if(index==arr.length) return;
        recPrint(arr,index+1);
        System.out.print(arr[index]+" ");
    }
}
