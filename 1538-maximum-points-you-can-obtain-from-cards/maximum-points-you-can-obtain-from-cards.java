class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total = 0;
        for (int i = n - k; i < n; i++) {
            total += cardPoints[i];
        }
        int maxScore = total;
        for (int i = 0; i < k; i++) {
            total -= cardPoints[n - k + i];
            total += cardPoints[i];
            maxScore = Math.max(maxScore, total);
        }
        return maxScore;
    }
}