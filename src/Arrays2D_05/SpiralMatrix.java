package Arrays2D_05;

import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {

    }
    public ArrayList<Integer> spiralTransverse(int[][] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int m = arr.length, n = arr[0].length;
        int firstRow = 0, lastRow = m - 1, firstCol = 0, lastCol = n - 1;

        while (firstRow <= lastRow && firstCol <= lastCol) {
            // Right: traverse top row
            for (int j = firstCol; j <= lastCol; j++)
                ans.add(arr[firstRow][j]);
            firstRow++;
            if (firstRow > lastRow || firstCol > lastCol) break;

            // Down: traverse right column
            for (int i = firstRow; i <= lastRow; i++)
                ans.add(arr[i][lastCol]);
            lastCol--;
            if (firstRow > lastRow || firstCol > lastCol) break;

            // Left: traverse bottom row
            for (int j = lastCol; j >= firstCol; j--)
                ans.add(arr[lastRow][j]);
            lastRow--;
            if (firstRow > lastRow || firstCol > lastCol) break;

            // Up: traverse left column
            for (int i = lastRow; i >= firstRow; i--)
                ans.add(arr[i][firstCol]);
            firstCol++;
        }
        return ans;
    }
}
