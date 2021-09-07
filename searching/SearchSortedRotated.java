package searching;

public class SearchSortedRotated {
    public static int searchInSortedRotated(int[] arr, int target) {
        int l = 0;
        int r = arr.length-1;

        while(l <= r) {
            int mid = (l+r) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[l] < arr[mid]) {
                // left side is sorted 
                if (arr[mid] > target && arr[l] <= target) r = mid - 1;
                else l = mid + 1;
            } else {
                // right side is sorted
                if (arr[mid] < target && arr[r] >= target) l = mid + 1;
                else r = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 70, 100, 10, 20, 30, 40, 50, 60};
        int num = 70;
        System.out.println("Position of the Element: " + searchInSortedRotated(arr, num));
    }    
}