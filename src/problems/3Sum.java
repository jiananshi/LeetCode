class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        if (nums == null || nums.length < 3) return answer;
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length - 3; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) continue;
            int fp = i + 1, tp = nums.length - 1;
            int base = nums[i];
            while (fp < tp) {
                int sum = base + nums[fp] + nums[tp];
                if (sum == 0) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[fp]);
                    list.add(nums[tp]);
                    answer.add(list);
                    while (fp < tp && nums[fp] == nums[fp + 1]) fp++;
                    while (fp < tp && nums[tp] == nums[tp - 1]) tp--;
                    fp++;
                    tp--;
                } else if (sum > 0) {
                    tp--;
                } else {
                    fp++;
                }
            }
        }
        return answer;
    }
}

