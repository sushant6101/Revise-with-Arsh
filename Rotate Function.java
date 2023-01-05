class Solution 
{
    public int maxRotateFunction(int[] nums) 
    {
        int sum=0,pro=0;
        int k=nums.length;
        for(int i=0;i<k;i++)
        {
            pro+=nums[i]*i;
            sum+=nums[i];
        }
        int max=pro;
        for(int i=k-1;i>=1;i--)
        {
            pro=pro+sum-k*nums[i];
            max=Math.max(max,pro);
        }
        return max;
    }
}
