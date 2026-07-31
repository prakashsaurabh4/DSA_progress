package OOPS_08;

class ArrayLists{ //user defined data structure
    int[] arr = new int[10];
    int idx;
    int capacity;
    int size;
    ArrayLists(int i){
        this.capacity = capacity;
    }
    void add(int ele){
        if(idx == arr.length){
            int[] arr2 = new int[arr.length*2];
            for(int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];
            }
            arr = arr2;
        }
        arr[idx++] = ele;
        size++;
    }
    void remove(int ele){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == ele){
                arr[i] = 0;
                size--;
                break;
            }
        }
    }
    int capacity(){
        return arr.length;
    }
    int get(int i){
        return arr[idx];
    }
    void set(int index,int val){
        arr[index] = val;
    }
    void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}


public class OwnArrayList {
    public static void main(String[] args) {
      // ArrayList<Integer> arr = new ArrayList<>();
        ArrayLists arr = new ArrayLists(8);
        arr.add(1); arr.add(2); arr.add(3); arr.add(4); arr.add(5);
        System.out.println(arr.size);
        arr.display();
        System.out.println(arr.get(3));
        arr.add(6); arr.add(7);
        arr.display();
    }
}
