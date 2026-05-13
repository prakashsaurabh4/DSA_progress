package Basic_Sorting_02;

public class SelectionSort {
    public static void print(int[] arr){
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 7, 2, 0, 8, 2};
        int n = arr.length;
        print(arr);

        for(int i=0;i<n-1;i++){ //n-1 passes
            int min = Integer.MAX_VALUE;
            int index = -1;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min = arr[j];
                    index = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        print(arr);
    }
}
