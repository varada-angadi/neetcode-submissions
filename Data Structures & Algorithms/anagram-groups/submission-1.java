class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> pair = new HashMap<>(); 
        for(String s:strs){
            char[] sChar=s.toCharArray();
            Arrays.sort(sChar);
            String key = new String(sChar);
            pair.putIfAbsent(key, new ArrayList<>());
            pair.get(key).add(s);
        }
        return new ArrayList<>(pair.values());
    }
}
