class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int[] result = {0, 0};

        for (int i = 0; i < nums.length; i++) {
          int num = nums[i];
          if (m.containsKey(num)) {
            result[0] = m.get(num);
            result[1] = i;
            break;
          }
          m.put(target - num, i);
        }
        
        return result;
    }
}

