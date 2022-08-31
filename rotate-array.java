https://leetcode.com/problems/rotate-array/
class Solution {
    public void rotate(int[] nums, int k) {

        
        int n=nums.length;
        k=k%n;
        int m=n;
        n=n-k;
       
        m1(nums,0,n/2,n);
        n=m;
        m1(nums,n-k,(n-k+n-1)/2+1,n);
        m1(nums,0,n/2,n);
        
    }
    public void m1(int[] nums,int u,int v,int n)
    {   
        int k=1;
        for(int i=u;i<v;i++)
        {
            Reverse(nums,i,n-k);
            k=k+1;
        }  
    }
    
    
    public static void Reverse( int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
