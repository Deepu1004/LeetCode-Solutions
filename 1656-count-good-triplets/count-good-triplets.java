class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int cnt = 0;
        int n = arr.length;
        int i = 0, j = 1, k = 2;

        while (i < n - 2) {
            if (j >= n - 1) {
                i++;
                j = i + 1;
                k = j + 1;
                continue;
            }

            if (k >= n) {
                j++;
                k = j + 1;
                continue;
            }

            if (Math.abs(arr[i] - arr[j]) <= a &&
                Math.abs(arr[j] - arr[k]) <= b &&
                Math.abs(arr[i] - arr[k]) <= c) {
                cnt++;
            }

            k++;
        }

        return cnt;
    }
}
