class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0,maxlen=0,maxf=0;
        int[] hash = new int[26];
        while(r<s.length()){
            int val = s.charAt(r) - 'A';
            hash[val] += 1;
            maxf = Math.max(maxf,hash[val]);
            if(r-l+1 - maxf > k){
                hash[s.charAt(l) - 'A']--;
                l = l+1;
            }
            if(r-l+1 - maxf <= k){
                maxlen = Math.max(maxlen, r-l+1);
            }
            r++;
        }
        return maxlen;
    }
}