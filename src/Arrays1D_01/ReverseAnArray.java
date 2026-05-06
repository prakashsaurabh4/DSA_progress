package Arrays1D_01;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {5,2,7,6,3,8,9};
        int n = arr.length;

//        for(int i=0;i<n/2;i++){
//            //swap arr[i] ans arr[n-1-i]
//            int temp = arr[n-1-i];
//            arr[n-1-i] = arr[i];
//            arr[i] = temp;
//        }


        int i = 0, j = n-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
