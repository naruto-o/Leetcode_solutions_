class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int p1 = 0;
        int p2 = 1;
        while(p2<nums.length){
            if(nums[p1] == nums[p2]){
                p2++;
            }
            else if(nums[p1] != nums[p2]){
                p1++;
                int temp = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = temp;
                p2++;
                count++;
            }
        }
        return count;
    }
}
