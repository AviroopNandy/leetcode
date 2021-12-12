public class Q704BinarySearch {
  public int search(int[] nums, int target) {
    int len = nums.length;
    int l = 0, r = len - 1, mid;
    while(l <= r) {
      mid = l + ( r - l ) / 2;
      if(nums[mid] == target)
        return mid;
      if(target > nums[mid])
        l = mid + 1;
      else r = mid - 1;
    }
    return -1;
  }
}