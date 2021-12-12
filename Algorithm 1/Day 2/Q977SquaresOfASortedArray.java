public class Q977SquaresOfASortedArray {
  public int[] sortedSquares(int[] nums) {
    int len = nums.length;
    int[] finalArr = new int[len];
    int lower = 0, upper = len - 1, finalArrIndex = len - 1;
    while(lower <= upper) {
      int val1 = (int) Math.pow(nums[lower], 2);
      int val2 = (int) Math.pow(nums[upper], 2);
      if (val1 > val2) {
        finalArr[finalArrIndex--] = val1;
        lower++;
      } else {
        finalArr[finalArrIndex--] = val2;
        upper--;
      }
    }
    return finalArr;
  }
}
