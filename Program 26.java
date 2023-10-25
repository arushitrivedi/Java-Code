class Solution
{
    static int isPossible(int N, int arr[]) 
    {
        long sum=0;
        for(int x=0;x<N;x++)
        {
            sum+=sumOfDig(arr[x]);
        }
        if(sum%3==0)
        return 1;
        else
        return 0;
        // code here
    }
    public static int sumOfDig(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum=sum+n%10;
            n=n/10;
        }
        return sum;
    }
}
