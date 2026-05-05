package Arrays_01;

public class MultiplyInOddindexAndAddInEvenIndex {
    static void main(String[] args) {
        //int[] arr = {10,20,30,40,50,60};
        int[] arr = {1,2,3,4,5,6};
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");

            if(arr[i]%2==0){
                arr[i] +=10;
            }
            else{
                arr[i] *= 2;
            }
        }
        System.out.println();
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
