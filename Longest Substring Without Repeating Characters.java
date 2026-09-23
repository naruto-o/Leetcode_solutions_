https://leetcode.com/problems/longest-substring-without-repeating-characters/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer>map = new HashMap<>();
        int low = 0;
        int res =0;
        for(int high = 0;high<s.length();high++){
            char ch = s.charAt(high);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>1){
                char lch = s.charAt(low);
                map.put(lch,map.get(lch)-1);
                low++;
            }
            res = Math.max(res,high-low+1);
        }
        return res;
    }
}
