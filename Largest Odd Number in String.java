https://leetcode.com/problems/largest-odd-number-in-string/
class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        if(num.charAt(n-1)%2 != 0){
         return num;
        }
        else{
            for (int i = n-1; i >= 0; i--) {
                if(num.charAt(i)%2 != 0){
                    return num.substring(0,i+1);
                    // break;
                }
            }
        }
        return "";
    }
}
