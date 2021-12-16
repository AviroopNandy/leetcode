class Q344ReverseString {
  public void reverseString(char[] s) {
    int len = s.length;
    int lower = 0, upper = len - 1;
    while(lower < upper) {
      char temp = s[lower];
      s[lower] = s[upper];
      s[upper] = temp;
      lower++;
      upper--;
    }
  }
}