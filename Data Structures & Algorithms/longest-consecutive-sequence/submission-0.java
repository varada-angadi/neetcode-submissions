class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> unique = new HashSet<>();
        for(int i : nums){
            unique.add(i);
        }
        int longest = 0;
        for(int n : unique){
            int len = 1;
            if(!(unique.contains(n-1))){
                while(unique.contains(n+len)){
                    len++;
                }
            }
            longest=Math.max(longest, len);
        }
        return longest;
        
    }
}
