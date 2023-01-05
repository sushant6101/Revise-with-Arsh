class Solution 
{
    public boolean canFinish(int n, int[][] pre) 
    {
        if(pre.length==0)
            return true;
        boolean vis[]=new boolean[pre.length];
        int com[]=new int[n];
        for(int i=0;i<pre.length;i++)
            com[pre[i][1]]++;
        boolean f=true;
        while(f)
        {
            f=false;
            for(int i=0;i<pre.length;i++)
            {
                if(!vis[i])
                {
                    if(com[pre[i][0]]==0)
                    {
                        vis[i]=true;
                        com[pre[i][1]]--;
                        f=true;
                    }
                }
            }
        }
        for(int i:com)
            if(i!=0)
                return false;
        return true;
    }
}
