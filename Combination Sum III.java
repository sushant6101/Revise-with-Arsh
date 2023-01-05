class Solution 
{
    public List<List<Integer>> combinationSum3(int k, int n) 
    {
        List<List<Integer>> ans=new ArrayList<>();
        help(1,ans,new ArrayList<>(),k,n);
        return ans;
    }
    public void help(int i,List<List<Integer>> ans,List<Integer> curr,int k,int n)
    {
        if(n<0 || k<0)
            return;
        if(n==0 && k==0)
        {
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int j=i;j<=9;j++)
        {
            curr.add(j);
            help(j+1,ans,curr,k-1,n-j);
            curr.remove(curr.size()-1);
        }
    }
}
