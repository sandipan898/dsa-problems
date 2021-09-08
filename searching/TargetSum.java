package searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TargetSum {
    public static ArrayList<Integer> findTwoSUmNaive(int arr[], int target) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    list.add(arr[i]);
                    list.add(arr[j]);
                }
            }
        }
        return list;
    }

    public static ArrayList<Integer> findTwoSumHash(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i=0; i<arr.length; i++) {
            // tries to find the value (target - arr[i]) in hashtable
            int diff = target - arr[i];
            if (map.containsKey(diff)) {
                list.add(diff);
                list.add(arr[i]);
            } else {
                map.put(arr[i], 1);
            }
        }
        return list;
    }

    public static ArrayList<Integer> findTwoSumTwoPointer(int arr[], int target) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int l = 0;
        int r = arr.length - 1;
        Arrays.sort(arr);

        while(l < r) {
            int sum = arr[l] + arr[r];
            if (sum == target) {
                list.add(arr[l]);
                list.add(arr[r]);
                l++;
            } 
            else if (sum > target) r--;
            else l++;
        }
        return list;
    }

    public static ArrayList<Integer> findThreeSum(int[] arr, int target) { 
        ArrayList<Integer> list = new ArrayList<Integer>();

        Arrays.sort(arr);

        for (int i=0; i<arr.length; i++) {
            int l = i+1;
            int r = arr.length - 1;
            int diff = target - arr[i];

            while (l < r) {
                int sum = arr[l] + arr[r];
                if (sum == diff) {
                    list.add(arr[l]);
                    list.add(arr[r]);
                    list.add(arr[i]);
                    l++;
                } 
                else if (sum > target) r--;
                else l++;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        // int arrSorted[] = { 70, 100, 10, 20, 30, 40, 50, 60};
        int arr[] = {3, 5, 7, 8, 2, 1, 9, 10, 15, 14, 12};
        int target = 20;
        System.out.println(findTwoSUmNaive(arr, target));
        System.out.println(findTwoSumHash(arr, target));
        System.out.println(findTwoSumTwoPointer(arr, target));
        System.out.println(findThreeSum(arr, target));
    }
}
