public class Q283MoveZeroes {
  public void moveZeroes(int[] nums) {
    int len = nums.length;
    int i = 0;
    for(int j = 0; j < len; j++) {
      if(nums[j] != 0) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
      }
    }
  }
}