public class Q35SearchInsertPosition {
  public int searchInsert(int[] nums, int target) {
    int lower = 0, upper = nums.length - 1, mid = 0;
    while(lower <= upper) {
      mid = lower + (upper - lower) / 2;
      if (target == nums[mid]) {
        return mid;
      } else if (target < nums[mid]) {
        upper = mid - 1;
      } else {
        lower = mid + 1;
      }
    }
    return lower;
  }
}
