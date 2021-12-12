public class Q189RotateArray {
  public void rotate(int[] nums, int k) {
    int len = nums.length;
    k %= len;
    reverse(nums, 0, len-1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, len - 1);
  }

  private void reverse(int[] nums, int lower, int upper) {
    while(lower < upper) {
      int temp = nums[lower];
      nums[lower++] = nums[upper];
      nums[upper--] = temp;
    }
  }
}