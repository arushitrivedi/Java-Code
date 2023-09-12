class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Bruteforce Approach
        boolean check;
        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            check = true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    check = false;
                    break;
                }
            }
            if(check==true){
                array.add(arr[i]);
            }
        }
        return array;
    }
}
//Code here

