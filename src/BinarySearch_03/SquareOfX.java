package BinarySearch_03;

public class SquareOfX {
    public static void main(String[] args) {
        int target = 27;
        int ans = floorSqrt(target);

        System.out.println("Target        : " + target);
        System.out.println("Floor sqrt    : " + ans);
        System.out.println("Largest perfect square ≤ " + target + " is: " + ans * ans);
    }

    public static int floorSqrt(int target) {
        int low = 1, high = target, ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            if ((long) mid * mid == target) {
                return mid;                  // exact perfect square ✅
            } else if ((long) mid * mid < target) {
                ans = mid;                   // valid candidate → save it
                low = mid + 1;               // try larger → go RIGHT
            } else {
                high = mid - 1;              // too big → go LEFT
            }
        }

        return ans;
    }
}