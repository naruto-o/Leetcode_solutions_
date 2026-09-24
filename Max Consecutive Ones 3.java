class Solution {
    public int longestOnes(int[] nums, int k) {
        int low = 0;
        int res =0;
        int []freq = new int[2];
        for(int high =0;high<nums.length;high++){
            if(nums[high] == 0){
                freq[0]++;
            }else{
                freq[1]++;
            }
            while(freq[0] > k){
                if(nums[low]==0){
                    freq[0]--;
                }else{
                    freq[1]--;
                }
                low++;
            }
            res = Math.max((high-low+1),res);
        }
        return res;
    }
}
