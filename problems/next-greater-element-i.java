https://leetcode.com/problems/next-greater-element-i/
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length];
        for(int i = 0;i<nums1.length;i++){
            int k =0;
            for(;k<nums2.length;k++){
                if(nums1[i] == nums2[k]){
                    break;
                }
            }
            for(int j =k;j<nums2.length;j++){
                if(nums1[i] < nums2[j]){
                    arr[i] = nums2[j];
                    break;
                }
                else{
                    arr[i] = -1;
                }
            }
        }
        return arr;
    }
}
