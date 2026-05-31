package Arrays2D_05;

public class MinElementInMaxForEachRow {
    public static void main(String[] args) {
        int[][] arr = {{6,0,2,7,6},{1,3,6,2,2},{9,9,4,5,2}};
        int minOfMax = Integer.MAX_VALUE; //arr[0][0]

        for(int i = 0; i < arr.length; i++){
            int rowMax = Integer.MIN_VALUE;
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] > rowMax){
                    rowMax = arr[i][j];
                }
            }
            System.out.println("row "+ i +" max " + rowMax);
            if (rowMax < minOfMax) {
                minOfMax = rowMax;
            }
        }
        System.out.println(minOfMax);
    }
}
