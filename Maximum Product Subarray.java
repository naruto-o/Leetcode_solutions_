class Solution {
    public int maxProduct(int[] nums) {
        int maxend = nums[0];
        int minend = nums[0];
        int ans = nums[0];
        for(int i =1;i<nums.length;i++){
            if(nums[i]<0){
                int t = maxend;
                maxend = minend;
                minend = t;
            }
             maxend = Math.max(nums[i]*maxend,nums[i]);
             minend = Math.min(nums[i]*minend,nums[i]);
             int temp = Math.max(maxend,minend);
             ans = Math.max(temp,ans);
        }
        return ans;
    }
}
