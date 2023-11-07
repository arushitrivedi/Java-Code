//GFG : Sum of upper and lower triangles
class Solution
{
    //Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        // code here
        // int  k = 0;
        int sum = 0;
        int sum2 = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = i ; j < n ; j++)
            {
                sum += matrix[i][j];
            }
            for(int  k = 0  ; k < i+1 ; k++ )
            {
                sum2 += matrix[i][k];
            }
        }
        arr.add(sum);
        arr.add(sum2);
        return arr;
    }
}
