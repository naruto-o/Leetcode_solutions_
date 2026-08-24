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
//DUTCH NATIONAL FLAG ALGORITHM
class Solution {
    public void sortColors(int[] nums) {
        int low  = 0;
        int mid = 0;
        int high = nums.length -1;
        while(mid<=high){
            if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp; 
                high--;
            }
        }
    }
}
