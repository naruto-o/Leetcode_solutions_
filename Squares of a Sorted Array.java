class Solution {
    public int[] sortedSquares(int[] nums) {
        int[]nums2 = new int[nums.length];
        int p1 = 0;
        int p2 = nums.length-1;
        for(int i = nums.length-1;i>=0;i--){
            if(Math.abs(nums[p1])>Math.abs(nums[p2])){
                nums2[i] = nums[p1]*nums[p1];
                p1++;
            }else{
                nums2[i] = nums[p2]*nums[p2];
                p2--;
            }
        }
        return nums2;
    }
}
