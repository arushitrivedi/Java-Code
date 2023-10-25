//Fin duplicates in an array - gfg
class Solution 
{
    public static ArrayList<Integer> duplicates(int arr[], int n) 
    {
        ArrayList<Integer> result = new ArrayList<>();
        
        //outer loop 
        for(int i=0; i<n; i++){
            arr[arr[i]%n]+=n;
        }
        //another outer loop 
        for(int i=0; i<n; i++){
            if(arr[i]/n>=2){
                result.add(i);
            }
        }
        //statment 
        if(result.isEmpty()){
            result.add(-1);
        }
        return result;
        // code here
    }
}
