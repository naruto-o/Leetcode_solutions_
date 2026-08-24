class Solution {
    public void sortColors(int[] nums) {
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        for(int i = 0 ; i<nums.length;i++){
            if(nums[i] == 0){
                n1++;
            }
            if(nums[i] == 1){
                n2++;
            }
            if(nums[i] == 2){
                n3++;
            }
        }
       for(int i = 0 ; i<nums.length;i++){
           if(n1 > 0){
              nums[i] = 0;
              n1--;
           }else if( n2 > 0){
            nums[i] = 1;
            n2--;
           }else{
            nums[i] = 2;
            n3--;
           }
       }
        
    }
}
