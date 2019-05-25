class Solution {
    public List<Integer> findDuplicates(int[] nums) {
      List<Integer> answer = new ArrayList<>();
      if (nums.length < 2) return answer;
      for (int i = 0; i < nums.length; i++) {
        int j = Math.abs(nums[i]);
        if (nums[j - 1] < 0) {
          answer.add(j);
        } else {
          nums[j - 1] = -nums[j - 1];
        }
      }
      return answer;
    }
}

