package searching;

public class SearchImplement {
    public static int binarySearchRec(int[] arr, int l, int r, int target) {
        if (l > r) return -1;

        int mid = (l+r) / 2;
        if (arr[mid] == target) return mid;
        if (arr[mid] > target) return binarySearchRec(arr, l, mid-1, target);
        else return binarySearchRec(arr, mid+1, r, target);
    }

    public static int binarySearchIte(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        
        while(l <= r) {
            int mid = (l+r) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] > target) r = mid-1;
            else l = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 25, 34, 56, 78, 88, 100};
        int target = 34;
        System.out.println("Found on Index: " + binarySearchRec(arr, 0, arr.length-1, target));
        System.out.println("Found on Index: " + binarySearchIte(arr, target));
    }
}
