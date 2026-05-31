package Arrays2D_05;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);a.add(2);a.add(3);a.add(4);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(5);b.add(6);b.add(7);b.add(8);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(9);c.add(10);c.add(11);c.add(12);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a);arr.add(b);arr.add(c);

        //System.out.println(arr);

//        for(int i=0;i<arr.size();i++){
//            for(int j=0;j<arr.get(i).size();j++){
//                System.out.print(arr.get(i).get(j)+" ");
//            }
//            System.out.println();
//        }

        arr.add(new ArrayList<>());
        arr.get(arr.size()-1).add(10);        arr.get(arr.size()-1).add(20);

        for(ArrayList<Integer> list:arr){
            for(int ele:list){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
