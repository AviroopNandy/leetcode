class Q557ReverseWordsInAString {
  public String reverseWords(String s) {
    String finalString = "";
    for(String word: s.split(" ")) {
      char[] str = word.toCharArray();
      int lower = 0, upper = str.length - 1;
      while(lower < upper) {
        char temp = str[lower];
        str[lower] = str[upper];
        str[upper] = temp;
        lower++;
        upper--;
      }
      for(int i = 0; i < str.length; i++) {
        finalString = finalString + str[i];
      }
      finalString = finalString + " ";
    }
    return finalString.trim();
  }
}