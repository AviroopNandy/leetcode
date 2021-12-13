public class Q167TwoSum2InputArrayIsSorted {
  public int[] twoSum(int[] numbers, int target) {
    int len = numbers.length;
    int lower = 0, upper = len - 1;
    while(numbers[lower] + numbers[upper] != target) {
      if(numbers[lower] + numbers[upper] < target) {
        lower++;
      } else {
        upper--;
      }
    }
    return new int[]{lower + 1, upper + 1};
  }
}