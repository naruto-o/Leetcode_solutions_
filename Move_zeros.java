https://leetcode.com/problems/move-zeroes/
class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length<2){
            return;
        }
        int left = 0; 
        int right = 1;
        while(right < nums.length){
            if(nums[left] != 0){
                left ++;
                right ++;
            }
            else if(nums[right] == 0){
                right ++ ;
            }
            else{
               int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp ;
            }
        }
    }
}
