class Solution 
{
    public List<Integer> largestDivisibleSubset(int[] nums) 
    {
        List<Integer> ans=new ArrayList<>();
        int dp[]=new int[nums.length];
        Arrays.fill(dp,1);
        Arrays.sort(nums);
        int max=1,prev=-1;
        for(int i=1;i<nums.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i]%nums[j]==0)
                {
                    dp[i]=Math.max(dp[i],1+dp[j]);
                    max=Math.max(dp[i],max);
                }
            }
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            if(dp[i]==max && (prev==-1 || prev%nums[i]==0))
            {
                ans.add(nums[i]);
                max--;
                prev=nums[i];
            }
        }
        return ans;
    }
}
