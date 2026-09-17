class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0; 
        int right = 0;
        int curr_sum = 0;
        int result = Integer.MAX_VALUE;
        for(right =0;right<nums.length;right++){
            curr_sum += nums[right];

            while(curr_sum >= target){
                result = Math.min(result,right-left+1);
                curr_sum -= nums[left++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
