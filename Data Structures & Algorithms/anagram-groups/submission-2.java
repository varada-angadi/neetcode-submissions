class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List> occurance = new HashMap<>();
        int[] freq = new int[26];
        for(String s : strs){
            Arrays.fill(freq,0);
            for(int i=0;i<s.length();i++){
                freq[s.charAt(i)-'a']++;
            }
            String key = Arrays.toString(freq);
            occurance.putIfAbsent(key, new ArrayList());
            occurance.get(key).add(s);
            
        }
        return new ArrayList(occurance.values());
    }
}
