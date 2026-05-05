package Arrays_01;

public class MaximunInArray {
    static void main(String[] args) {

        int[] arr = {-6,8,14,-2,23,47,4,3,10};
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);
    }
}
