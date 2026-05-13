package Basic_Sorting_02;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,1,7,3,9,2,0,8};
        for(int i=0;i<arr.length;i++){
            int j = i;
            while(j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
