package Arrays_01;

public class SearchInArrayOrLinearSearch {
    static void main(String[] args) {
        int[]  arr = {12,3,27,53,18,62,88,6,53};
        int x = 53;
       boolean flag = false; // false means target not in Array
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x) {
                System.out.println("Target exists in Array at index "+i); //for index of taget
                flag = true; // true means target in Array
                break;
            }
        }
        if(flag == true){
            System.out.print("Target exist in Array");
        }
        else{
            System.out.print("Target not exist in Array");
        }
    }
}
