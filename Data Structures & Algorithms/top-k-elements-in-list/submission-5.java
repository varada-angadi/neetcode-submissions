class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int n:nums){
            freq.put(n,freq.getOrDefault(n,0)+1);
        }
        List<Integer>[] bucket = new ArrayList[nums.length+1];
        for(int key:freq.keySet()){
            int index = freq.get(key);
            if(bucket[index]==null){
                bucket[index]=new ArrayList<>();
            }
            bucket[index].add(key);
        }
        int[] res = new int[k];
        int count=0;
        for(int j = bucket.length-1;j>=0 &&count<k;j--){
            if(bucket[j]!=null){
                for(int x:bucket[j]){
                    res[count]=x;
                    count++;
                    
                }

            }
        } 
        return res;
    }
}
