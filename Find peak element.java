
//linear search solution
class Solution {
    public int findPeakElement(int[] nums) {
        for(int i =0;i<nums.length-1;i++){
            if(nums[i] >nums[i+1]){
                return i;
            }
        }
        return nums.length-1;
    }
}

//binary search
public class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[mid + 1])
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }
}
