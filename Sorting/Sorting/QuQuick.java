package Sorting;

public class QuQuick {
    public static void main(String[] args) {
        // Input array
        int[] arr = {10, 7, 8, 9, 1, 5};

        // Create object
        Solution sol = new Solution();

        // Call quickSort
        sol.quickSort(arr, 0, arr.length - 1);

        // Print sorted array
        for (int num : arr)
            System.out.print(num + " ");
    }
}
