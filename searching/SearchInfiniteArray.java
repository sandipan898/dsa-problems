package searching;
public class SearchInfiniteArray {

    public static int searchElementNaive(int[] arr, int target) {
        int i = 0;
        while (arr[i] <= target) {
            if (arr[i] == target) return i;
            i++;
        }
        return -1;
    }

    public static int searchElement(int arr[], int target) {
        if (arr[0] == target ) return 0;
        int i = 0;
        while (arr[i] <= target) {
            i *= i;
        }
        return SearchImplement.binarySearchRec(arr, i/2+1, i-1, target);
    }
    public static void main(String[] args) {
        int arr[] = {1, 10, 20, 30, 40, 50, 60, 70, 100};
        int num = 70;
        System.out.println("Position of the Element: " + searchElementNaive(arr, num));
    }
}
