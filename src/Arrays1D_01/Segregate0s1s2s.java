package Arrays1D_01;

public class Segregate0s1s2s {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 0, 2, 0, 1, 2, 1, 0, 2};

        int numberOfZeros = 0;
        int numberOfOnes = 0;
        int numberOfTwos = 0;
        for(int x : arr){
            if(x == 0) numberOfZeros++;
            else if(x == 1) numberOfOnes++;
            else numberOfTwos++;
        }
        for (int i = 0; i < numberOfZeros; i++) {
            arr[i] = 0;
        }
        for (int i = numberOfZeros; i < numberOfZeros + numberOfOnes; i++) {
            arr[i] = 1;
        }
        for (int i = numberOfZeros + numberOfOnes; i < arr.length; i++) {
            arr[i] = 2;
        }
        System.out.print("After: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
