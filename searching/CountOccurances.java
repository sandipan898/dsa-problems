package searching;

public interface CountOccurances {
    public static int countOccurances(int[] arr, int target) {
        int firstIndex = FindFirstOccurance.findFirstOccBinIte(arr, target);
        if (firstIndex != -1) {
            int lastIndex = FindLastOccurance.findLastOccBinIte(arr, target);
            return lastIndex - firstIndex + 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {5, 10, 10, 15, 20, 20, 20};
        int target = 20;
        System.out.println("The number of occurances of " + target + " is: " + countOccurances(arr, target));
    }
}
