package Arrays_01;

public class TwoSum {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n =  arr.length;
        int target = 5;
        boolean flag = false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] + arr[j] == target)
                flag = true;
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
