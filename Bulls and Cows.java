class Solution 
{
    public String getHint(String s, String g) 
    {
        int b=0,c=0;
        int a[]=new int[10];
        int a1[]=new int[10];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            char ch1=g.charAt(i);
            if(ch1==ch)
                b++;
            else
            {
                a[ch-'0']++;
                a1[ch1-'0']++;
            }
        }
        for(int j=0;j<10;j++)
            c+=Math.min(a[j],a1[j]);
        return b+"A"+c+"B";
    }
}
