class Solution {
    public void sortColors(int[] nums) {
        int zero =0,one=0,two=0;
        for(int i = 0 ; i < nums.length;i++){
            if(nums[i] == 0){
                zero++;
            }
            if(nums[i]==1){
                one++;
            }
            if(nums[i]==2){
                two++;
            }
        }
        int idx = 0;
        for(int i = 0 ; i<zero;i++){
            nums[idx++] = 0;
        }
           for(int i = 0 ; i<one;i++){
            nums[idx++] = 1;
        }
           for(int i = 0 ; i<two;i++){
            nums[idx++] = 2;
        }
    }
}
