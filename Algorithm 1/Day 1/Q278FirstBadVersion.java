/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Q278FirstBadVersion extends VersionControl {
  public int firstBadVersion(int n) {
    int lower = 1, upper = n, mid;
    while(lower <= upper) {
      mid = lower + (upper - lower) / 2;
      if(!isBadVersion(mid))
        lower = mid + 1;
      else
        upper = mid - 1;
    }
    return lower;
  }
}