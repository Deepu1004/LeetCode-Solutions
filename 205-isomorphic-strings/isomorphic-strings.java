class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Character> m1 = new HashMap<>();
        Map<Character, Character> m2 = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i), c2 = t.charAt(i);
            if(m1.containsKey(c1)){
                if(m1.get(c1) != c2) return false;
            }
            else{
                m1.put(c1,c2);
            }
            if(m2.containsKey(c2)){
                if(m2.get(c2) != c1) return false;
            }
            else{
                m2.put(c2,c1);
            }
        }
        return true;
    }
}