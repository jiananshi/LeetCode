class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int fp = 0;
        int tp = numbers.length - 1;
        
        while (fp < tp) {
            int sum = numbers[fp] + numbers[tp];
            if (sum == target) {
                return new int[]{fp + 1, tp + 1};
            } else if (sum > target) {
                tp--;
            } else {
                fp++;
            }
        }
        
        return null;
    }
}

