class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[left++];
            sum = sum + nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum/k;
    }
}
