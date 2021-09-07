package searching;

public class FindPeakElement {
    public static int findPeakNaive(int arr[]) {
        if (arr.length <= 1 || arr[0] > arr[1]) return arr[0];
        
        for (int i=1; i<arr.length; i++) {
            if (i > arr.length-1 && arr[i] > arr[i-1] && arr[i] > arr[i+1]) return arr[i];
            if (i == arr.length - 1 && arr[i] > arr[i-1]) return arr[i];
        }
        return -1;
    }

    public static int findPeakBin(int arr[]) {
        if (arr.length <= 1) return arr[0];
        int l = 0;
        int r = arr.length-1;

        while (l <= r) {
            int mid = (l+r)/2;

            if ((mid==0 || arr[mid-1] <= arr[mid]) && (mid == arr.length-1 || arr[mid+1] <= arr[mid])) 
                return mid;
            if (mid > 0 && arr[mid-1] > arr[mid]) r = mid - 1;
            else l = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 10, 20, 30, 40, 50, 60, 70, 100};
        System.out.println("Peak Element is: " + findPeakNaive(arr));
        System.out.println("Peak Element is: " + arr[findPeakBin(arr)]);
    }
}
