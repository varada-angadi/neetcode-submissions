class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] sChar=s.toLowerCase().toCharArray();
        char[] tChar=t.toLowerCase().toCharArray();

        int[] frequency=new int[26];

        for(int i=0;i<s.length();i++){
            frequency[sChar[i]-'a']++;
            frequency[tChar[i]-'a']--;
        }

        for(int j=0;j<26;j++){
            if(frequency[j]!=0){
                return false;
            }
        }
        return true;
    }
}
