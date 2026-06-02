class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i:nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        Queue<Integer> heap = new PriorityQueue(
            (a,b) -> freq.get(a)-freq.get(b)
        );
        for(int i:freq.keySet()){
            heap.add(i);
            if(heap.size()>k){
                heap.poll();
            } 
        }
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i]=heap.poll();
        }
        return res;
        
    }
}
