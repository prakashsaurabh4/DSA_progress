package Basic_Sorting_02;

public class BubbleSort {
    public static void print(int[] arr){
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 7, 2, 0, 7, 2};
        int n = arr.length;
        print(arr);
//        for(int i=0;i<n-1;i++){   //n-1 pass
//            for(int j=0;j<n-i-1;j++){
//                if(arr[j]>arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//        print(arr);

        //Bulle Sort Optimised
        for(int i=0;i<n-1;i++){  //n-1 passes
            int swap = 0;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap==0) break;
        }
        print(arr);
    }
}
