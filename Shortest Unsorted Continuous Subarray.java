class Solution 
{
    public int findUnsortedSubarray(int[] nums) 
    {
        int [] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++)
            arr[i]=nums[i];
        Arrays.sort(arr);
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=arr[i])
            {
                c=i;
                break;
            }
        }
        int e=0;
         for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]!=arr[i])
            {
                e=i;
                break;
            }
        }
        return (c==e)?0:e-c+1;
    }
}
