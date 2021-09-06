package searching;

public class FindLastOccurance {
    public static int findLastOccBinRec(int[] arr, int l, int r, int target) {
        if (l <= r) {
            int mid = (l+r) / 2;
             if (arr[mid] > target) return findLastOccBinRec(arr, l, mid-1, target);
             else if (arr[mid] < target) return findLastOccBinRec(arr, mid+1, r, target);
             else {
                 if (mid != arr.length-1 && arr[mid+1] == arr[mid]) {
                     return findLastOccBinRec(arr, mid+1, r, target);
                 } else return mid;
             }
        } 
        return -1;
    }

    public static int findLastOccBinIte(int[] arr, int target) {
        int l = 0;
        int r = arr.length;
        
        while (l < r) {
            int mid = (l+r) / 2;
            if (arr[mid] > target) r = mid-1;
            else if (arr[mid] < target) l = mid+1;
            else {
                if (mid != arr.length-1 && arr[mid] == arr[mid+1]) l = mid+1;
                else return mid;
            } 
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {5, 10, 10, 15, 20, 20, 20};
        int target = 20;
        // System.out.println("Found on Index: " + findLastOccBinRec(arr, 0, arr.length, target));
        System.out.println("Found on Index: " + findLastOccBinIte(arr, target));
    }
}
