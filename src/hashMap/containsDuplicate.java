class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        int l = nums.length;
        for (int i = 0; i < l; i++) {
          int num = nums[i];
          if (hashSet.contains(num)) return true;
          hashSet.add(num);
        }
        return false;
    }
}

