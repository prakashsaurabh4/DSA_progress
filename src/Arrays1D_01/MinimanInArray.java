package Arrays1D_01;

public class MinimanInArray {
    static void main(String[] args) {
        int[] arr = {3,7,23,-8,7};
        int min = arr[0];   //Integer.MAX_VALUE   also used
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];

        }
        System.out.println(min);
    }
}
