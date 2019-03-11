class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = {0, 0};
        for (int i = 0; i < numbers.length; i++) {
            int expected = target - numbers[i];
            int found = binarySearch(numbers, i + 1, expected);
            if (found != -1) {
                result[0] = i + 1;
                result[1] = found + 1;
                break;
            }
        }
        return result;
    }
    
    public int binarySearch(int[] nums, int start, int target) {
      if (nums.length == 0) return -1;
      int mid;
      int end = nums.length - 1;
      while (start <= end) {
        mid = (end - start) / 2 + start;
        int val = nums[mid];
        if (target < val) {
          end = mid - 1;
        } else if (target > val) {
          start = mid + 1;
        } else {
          return mid;
        }
      }
      return -1;
    }
}

