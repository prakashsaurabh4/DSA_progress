package Arrays2D_05;

public class ForEachIn2D {
    public static void main(String[] args) {
        int[][] arr = {{6,0,2,7,6},{1,3,7,2,2},{9,9,4,5,2}};

//        for(int i=0;i<arr.length;i++){
//            for(int ele :  arr[i]){ //arr[i] is itself array
//                System.out.print(ele+" ");
//            }
//            System.out.println();
//        }

        for(int[] a : arr){
            for(int ele : a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
