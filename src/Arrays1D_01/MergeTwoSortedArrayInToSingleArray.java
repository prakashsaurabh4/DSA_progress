package Arrays1D_01;

public class MergeTwoSortedArrayInToSingleArray {
    public static void main(String[] args) {
        int[] a = {2,5,6,9,20};
        int[] b = {1,3,4,5,7,8};

        int[] c = new int[a.length+b.length];
        for(int x : c)
            System.out.print(x+" ");
        System.out.println();
        merge(a,b,c);
        for(int x : c)
            System.out.print(x+" ");
    }


    public static void merge(int[] a, int[] b, int[] c) {
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k]=a[i];  //c[k++] = a[i++]
                i++;
            }
            else {
                c[k]=b[j];   //c[k++] = b[j++]
                j++;
            }
            k++;
        }
        if(i==a.length){  //If Array A is empty then it print Array B as it is.
           while(j<b.length){
               c[k++] = b[j++];
           }
        }
        else{  //If Array B is empty then it print Array A as it is.
            while(i<a.length){
                c[k++] = a[i++];
            }
        }
    }
}
