class Solution {
    public int lengthOfLongestSubstring(String s) {
      int n = s.length();
      Map<Character, Integer> map = new HashMap<>();
      int result = 0, i = 0, j = 0;
      while (j < n) {
        if (map.containsKey(s.charAt(j))) {
          i = Math.max(map.get(s.charAt(j)) + 1, i);
        }
        result = Math.max(j - i + 1, result);
        map.put(s.charAt(j), j);
        j++;
      }
      return result;
    }
}

