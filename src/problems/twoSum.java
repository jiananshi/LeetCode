class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sp = 0;
        
        while (sp < nums.length - 1) {
            int base = nums[sp];
            int expected = target - base;
            int fp = sp + 1;
            while (fp < nums.length) {
                if (nums[fp] == expected) {
                    int[] result = {sp, fp};
                    return result;
                }
                fp++;
            }
            sp++;
        }
        return null;
    }
}

