//LEETCODE : Remove Element
class Solution 
{
    public int removeElement(int[] ar, int val) 
  {
        int len=ar.length;
        int i=len-1;
        int count=0;
        if(len==1)
        {
            if(ar[0]==val)
                return 0;
            else
                return 1;
                
        }
        for(int x=0;x<len&&x<=i;x++)
        {
            if(ar[x]==val)
            {
                count++;
                if(ar[i]!=val&&i>x)
                {
                    int t=ar[x];
                    ar[x]=ar[i];
                    ar[i]=t;
                    i--;
                }
                else
                {
                    i--;
                    x--;
                }
            }
        }
        return len-count;
    }
}
