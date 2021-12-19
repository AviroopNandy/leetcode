public class Q3LongestSubstringWithoutRepeatingCharacters {
  public int lengthOfLongestSubstring(String s) {
    int left = 0, right = 0, result = 0;
    HashSet<Character> substr = new HashSet();
    while(right < s.length()) {
      if(!substr.contains(s.charAt(right))) {
        substr.add(s.charAt(right));
        result = Math.max(result, substr.size());
        right++;
      } else {
        left++;
        right = left;
        substr.clear();
      }
    }
    return result;
  }
}
