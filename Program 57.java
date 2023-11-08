// GFG : Leaders in an array
class Solution
{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n)
    {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int max=arr[n-1];
        
        while(n-->0)
        {
            
            if(arr[n]>=max)
            {
              list.add(arr[n]);
              max=arr[n];
            }
            
        }
        
         Collections.sort(list, Collections.reverseOrder());
         
         return list;
        // Your code here
    }
}
