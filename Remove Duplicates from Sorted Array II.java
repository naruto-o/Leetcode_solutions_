class Solution {
    public int removeDuplicates(int[] nums) {
        int cnt = 1;
        int p1 = 0;
        int p2 = 1;
        while(p2<nums.length){
            if(nums[p1] == nums[p2] && cnt<2){
                cnt++;
                p1++;
                nums[p1] = nums[p2];
                p2++;
            }
             else if(nums[p1] == nums[p2] && cnt==2){
                p2++;
            }
            else if(nums[p1]!=nums[p2]){
                cnt =1;
                p1++;
                nums[p1] = nums[p2];
                p2++;
            }
        }
        return p1+1;
    }
}
