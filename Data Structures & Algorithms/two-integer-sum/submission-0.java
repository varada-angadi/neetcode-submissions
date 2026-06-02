class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> track = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff= target-nums[i];
            if(track.containsKey(diff))
            {
                if(i<track.get(diff)){
                    return new int[]{i, track.get(diff)};
                }
                else{
                    return new int[]{track.get(diff),i};
                }
            }
            else{
                track.put(nums[i],i);
            }
        }
        return new int[]{};

    }
}
