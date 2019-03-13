class Solution {
  public int search(int[] nums, int target) {
    if (nums.length == 0) return -1;
    int mid;
    int start = 0;
    int end = nums.length - 1;
    while (start <= end) {
      mid = (end - start) + start;
      num = nums[mid];
      if (num > target) {
        end = mid - 1;
      } else if (num < target) {
        start = mid + 1;
      } else {
        return mid;
      }
    } 
    return -1;
  }
}

