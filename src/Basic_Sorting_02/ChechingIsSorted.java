package Basic_Sorting_02;

public class ChechingIsSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};

        boolean isSorted = true;

        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]) {
                System.out.println("Not sorted");
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }
    }
}
