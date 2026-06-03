class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> unique = new HashSet<>();
        if(s.length()==0) return 0;
        if(s.length()==1) return 1;
        int left = 0;
        int right = 0;
        int maxi = 0;
        while(right<s.length()){
            while(unique.contains(s.charAt(right))){
                unique.remove(s.charAt(left));
                left++;
            }
                unique.add(s.charAt(right));
                maxi=Math.max(maxi, right-left+1);
                right++;
            }
        
        return maxi;

        
    }
}
