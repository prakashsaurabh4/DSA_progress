package Arrays1D_01;

public class SecondMaxInArray {
     public static void main(String[] args) {
        int[] arr = {5,8,11,98,77,65};
        int max = arr[0];
        int max2 = arr[0];
        //Calculate max
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max2 && arr[i] !=max){
                max2 = arr[i];
            }
        }
         System.out.println("First Max "+max);
         System.out.println("Second Max "+max2);
    }
}
