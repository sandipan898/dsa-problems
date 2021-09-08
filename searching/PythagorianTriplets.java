package searching;

import java.util.ArrayList;
import java.util.Arrays;

public class PythagorianTriplets {
    public static ArrayList<Integer> findPythagorianTriplets(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<arr.length; i++) arr[i] *= arr[i];
        Arrays.sort(arr);

        for (int i=0; i<arr.length; i++) {
            int l = 0; 
            int r = i - 1;

            while(l < r) {
                int sumSq = arr[l] + arr[r];
                if (sumSq == arr[i]) {
                    list.add((int)Math.pow(arr[i], 0.5));
                    list.add((int)Math.pow(arr[l], 0.5));
                    list.add((int)Math.pow(arr[r], 0.5));
                    l++;
                }
                else if (sumSq > arr[i]) r--;
                else l++;
            }
        }
        return list;
    }
    
    public static void main(String[] args) {
        int arr[] = {3, 1, 4, 6, 5};
        System.out.println(findPythagorianTriplets(arr));
    }
}
