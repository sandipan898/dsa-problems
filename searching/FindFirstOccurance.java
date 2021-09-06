package searching;

class FindFirstOccurance {
    public static int findFirstOccLin(int[] arr, int target) {
        for (int i=0; i<arr.length; i++) 
            if (arr[i] == target) return i;
        return -1;
    }

    public static int findFirstOccBinIte(int[] arr, int target) {
        int left = 0; 
        int right = arr.length - 1;
        while(left <= right) {
            int mid = (left+right) / 2;

            if (arr[mid] > target) right = mid-1;
            else if (arr[mid] < target) left = mid+1;
            else {
                if (mid != 0 && arr[mid-1] == arr[mid]) right = mid-1;
                else return mid;
            }
        }
        return -1;
    }
    public static int findFirstOccBinRec(int[] arr, int l, int r, int target) {
        if (l > r) return -1;

        int mid = (l+r) / 2;
        if (arr[mid] > target) return findFirstOccBinRec(arr, l, mid-1, target);
        else if (arr[mid] < target) return findFirstOccBinRec(arr, mid+1, r, target);
        else {
            if (mid != 0 && arr[mid-1] == arr[mid]) 
                return findFirstOccBinRec(arr, l, mid-1, target);
            else return mid;
        } 
    }

    public static void main(String[] args) {
        int arr[] = {5, 10, 10, 15, 20, 20, 20};
        int target = 20;
        // System.out.println("Found on Index: " + findFirstOccBinRec(arr, 0, arr.length, target));
        System.out.println("Found on Index: " + findFirstOccBinIte(arr, target));
    }
}