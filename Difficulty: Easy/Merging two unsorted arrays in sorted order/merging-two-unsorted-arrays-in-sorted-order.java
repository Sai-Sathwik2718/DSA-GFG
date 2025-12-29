class Solution {
    public void sortedMerge(int[] arr1, int[] arr2, int[] res) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int n = arr1.length;
        int m = arr2.length;

        int i = n - 1;      // arr1 index
        int j = m - 1;      // arr2 index
        int k = n + m - 1;  // result index

        // Merge from the end
        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                res[k--] = arr1[i--];
            } else {
                res[k--] = arr2[j--];
            }
        }

        // Copy remaining elements
        while (i >= 0) {
            res[k--] = arr1[i--];
        }

        while (j >= 0) {
            res[k--] = arr2[j--];
        }
    }
}
