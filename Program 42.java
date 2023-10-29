//GFG : Check whether K-th bit is set or not
class CheckBit
{
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k)
    {
         int bitmask = 1<<k;
    return (n&bitmask) == 0 ?false:true;
        // Your code here
    }
    
}
