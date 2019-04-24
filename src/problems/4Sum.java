class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        if (nums == null || nums.length < 4) return answer;
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length - 4; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) continue;
            List<List<Integer>> result = threeSum(nums, target - nums[i], i);
            if (result.size() != 0) {
                answer.addAll(result);
            }
        }
        return answer;
    }
    
    public List<List<Integer>> threeSum(int[] nums, int target, int index) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        if (nums == null || nums.length < 3) return answer;
        Arrays.sort(nums);
        for (int i = index + 1; i <= nums.length - 3; i++) {
            if (i != index + 1 && nums[i] == nums[i - 1]) continue;
            int fp = i + 1, tp = nums.length - 1;
            int base = nums[i];
            while (fp < tp) {
                int sum = base + nums[fp] + nums[tp];
                if (sum == target) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[index]);
                    list.add(nums[i]);
                    list.add(nums[fp]);
                    list.add(nums[tp]);
                    answer.add(list);
                    while (fp < tp && nums[fp] == nums[fp + 1]) fp++;
                    while (fp < tp && nums[tp] == nums[tp - 1]) tp--;
                    fp++;
                    tp--;
                } else if (sum > target) {
                    tp--;
                } else {
                    fp++;
                }
            }
        }
        return answer;
    }
}

