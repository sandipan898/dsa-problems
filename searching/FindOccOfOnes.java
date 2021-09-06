package searching;

public class FindOccOfOnes {
    public static int findOnes(int arr[]) {
        int l = 0;
        int r = arr.length;

        while (l < r) {
            int mid = (l+r) / 2;
            if (arr[mid] == 0) {
                l = mid+1;
            } else {
                if (mid != 0 && arr[mid-1] == arr[mid]) r = mid-1;
                else return (arr.length - mid);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {0, 0, 0, 0, 1, 1, 1, 1, 1};
        System.out.println("Number of 1's: " + findOnes(arr));
    }
}
