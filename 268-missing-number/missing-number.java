class Solution {
    public int missingNumber(int[] arr)
    {
        int n=arr.length, sm = 0;
        for(int i=0;i<n;i++){
            sm += arr[i];
        }
        return Math.abs(sm - ((n*(n+1)/2)));
    }
}