class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && (c <= '9'))){
                sb.append(c);
            }
        }
        s = sb.toString();
        int n = s.length();
        for(int i =0;i<n/2;i++){
            if(s.charAt(n-1-i) != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}