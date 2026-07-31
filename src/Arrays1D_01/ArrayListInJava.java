package Arrays1D_01;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInJava {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(30);
        arr.add(18);
        arr.add(22);
        arr.add(10);

        System.out.println(arr.get(2));
        arr.set(3,50);  // arr[3]=50;  change in the value of array
        System.out.println(arr.get(3));

        System.out.println(arr);

        int n = arr.size(); //arr.length
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();


        for(int x : arr){
            System.out.print(x+" ");
        }


        System.out.println();
        arr.add(78);
        arr.add(1, 100);
        System.out.println(arr);

        System.out.println();
        arr.remove(arr.size()-1);
        System.out.print(arr);


        //Reverse an Array
        System.out.println();
        Collections.reverse(arr);
        System.out.print(arr);

        System.out.println();
        int i=0,j=arr.size()-1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }

        //Also use with String
    }
}
