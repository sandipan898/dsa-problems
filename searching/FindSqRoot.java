package searching;

public class FindSqRoot {
    public static int findSqRootFloorNaive(int x) {
        int i = 0;
        while (i*i <= x) i++;
        return i-1;
    }

    public static int findSqRootFloor(int x) {
        int ans = -1;
        int l = 1;
        int r = x;

        while(l <= r) {
            int mid = (l+r) / 2;
            if (mid*mid == x) return mid;
            else if (mid*mid > x) r = mid-1;
            else {
                ans = mid;
                l = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int x = 15;
        System.out.println("Square root is: " + findSqRootFloorNaive(x));
        System.out.println("Square root is: " + findSqRootFloor(x));
    }
}
