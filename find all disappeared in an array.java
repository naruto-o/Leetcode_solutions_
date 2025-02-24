class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = n*(n+1)/2;
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
        }
        return total - sum;
        // Arrays.sort(nums);
        // for(int i = 0;i<nums.length;i++){
        //     if(nums[i] != i){
        //         return i;
        //     }
        // }
        // return nums.length;
    }
}
