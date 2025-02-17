class Solution {
    public int numberOfSubstrings(String s) {
        int l=0, r=0;
        int cnt=0;
        int[] hs = new int[3];
        while(r<s.length()){
            hs[s.charAt(r) - 'a']++;
            while(hs[0]>0 && hs[1] > 0 && hs[2] > 0){
                cnt += s.length()-r;
                hs[s.charAt(l) - 'a']--;
                l++;
            }
            r++;
            
        }
        return cnt;
    }
}