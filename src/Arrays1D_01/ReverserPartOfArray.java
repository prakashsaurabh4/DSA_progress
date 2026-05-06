package Arrays1D_01;

public class ReverserPartOfArray {  //Two Pointer technique
    public static void main(String[] args) {
        int[] arr = {5,2,7,6,3,8,9,10,12};
        int i = 2, j = 5;
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
