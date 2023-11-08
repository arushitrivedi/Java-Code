//GFG : Print matrix in snake pattern
class Solution
{
    //Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        ArrayList<Integer> lst=new ArrayList<>();
        int cnter=0;
        
        for(int i=0;i<matrix.length;i++)
        {
            cnter++;
            if(cnter%2!=0)
            {
                for(int j=0;j<matrix[0].length;j++)
                {
                    lst.add(matrix[i][j]);
                }
            }
            else
            {
                for(int j=matrix[0].length-1;j>=0;j--)
                {
                    lst.add(matrix[i][j]);
                }
            }
        }
        return lst;
        // code here 
    }
}
