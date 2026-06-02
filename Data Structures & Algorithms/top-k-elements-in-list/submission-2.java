class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i:nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        List<Integer>[] bucket = new List[nums.length+1];
        for(int i: freq.keySet()){
            int count = freq.get(i);
            if(bucket[count]==null){
                bucket[count]=new ArrayList<>();
            }
            bucket[count].add(i);
        }

        int[] res = new int[k];
        int count = 0;
        for(int i=bucket.length-1;i>=0 && count<k;i--){
            if(bucket[i]==null) continue;
            for(int j : bucket[i]){
                res[count]=j;
                count++;
            }
        }
        return res;
        
    }
}

