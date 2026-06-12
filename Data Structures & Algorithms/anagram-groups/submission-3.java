class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

		Map<String, List<String>> res = new HashMap<>();
		int[] freq = new int[26];
		for (String s : strs) {
			Arrays.fill(freq,0);
			s=s.toLowerCase();
			char[] charArray = s.toCharArray();
			for(char ch : charArray){
				freq[ch-'a']++;
			}
			String key = Arrays.toString(freq);
			res.putIfAbsent(key, new ArrayList<>());
			res.get(key).add(s);
		}
		return new ArrayList<>(res.values());
	}
}



