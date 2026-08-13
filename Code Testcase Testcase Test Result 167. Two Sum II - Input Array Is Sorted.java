class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int p1 = 0;
        int p2 = numbers.length-1;
        int arr[] = new int [2];
        while(p1<p2){
           if(numbers[p1]+numbers[p2] == target){
               arr[0] = p1 + 1;
               arr[1] = p2 + 1;
               return arr;
           }else if(numbers[p1]+numbers[p2] > target){
              p2--;
           }else if(numbers[p1]+numbers[p2] < target){
            p1++;
           }
           else{
                return null;
           }
        }
        return null;
    }
}
