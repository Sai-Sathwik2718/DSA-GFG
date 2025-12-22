class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;

        int[] freq = new int[n + 1];

        for (int x : arr) {
            freq[x]++;
        }

        int repeating = -1, missing = -1;

        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) repeating = i;
            if (freq[i] == 0) missing = i;
        }

        res.add(repeating);
        res.add(missing);
        return res;
    }
}
