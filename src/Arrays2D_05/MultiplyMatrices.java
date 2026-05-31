package Arrays2D_05;
import java.util.ArrayList;

public class MultiplyMatrices {

    public ArrayList<ArrayList<Integer>> multiply(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = b[0].length;
        int common = b.length; // a's cols == b's rows

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                int sum = 0;
                for (int k = 0; k < common; k++) {
                    sum += a[i][k] * b[k][j];
                }
                row.add(sum);
            }
            result.add(row);
        }
        return result;
    }

    public static void main(String[] args) {
        MultiplyMatrices obj = new MultiplyMatrices();

        int[][] a = {
                {1, 2},
                {3, 4}
        };
        int[][] b = {
                {5, 6},
                {7, 8}
        };

        ArrayList<ArrayList<Integer>> result = obj.multiply(a, b);

        System.out.println("Result:");
        for (ArrayList<Integer> row : result) {
            System.out.println(row);
        }
    }
}