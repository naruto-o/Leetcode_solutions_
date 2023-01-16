https://leetcode.com/problems/valid-anagram  
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] count = new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int i:count){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
/*
In below statement this happens
count[s.charAt(i)-'a']++;
s.charAt(i) --> is a char data type.
count is an integer array, int[]

we cannot assign char to an array so what is being done here is when you say
s.charAt(i)-'a'
Characters ASCII No - 'a' ASCII number.
Example if s1 = abc

a-a = 0
b-a = 1
c-a = 2

So by doing this an int is assigned to array and sine a-->z is in sequence and a being lowest, it just stays in sequence for unique character.

Hence
count[s.charAt(i)-'a']++; --> increments the count
count[t.charAt(i)-'a']--;--> decrements the count of characters checked in the string.
*/
