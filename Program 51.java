//GFG : Letters Collection
class Solution
{
    static List<Integer> matrixSum(int n, int m, int mat[][], int q, int queries[][])
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int[][] dir1 = {{0,1},{0,-1},{1,0},{-1,0},{1,1},{1,-1},{-1,1},{-1,-1}};
        int[][] dir2 = {{0,2},{1,2},{2,2},{-1,2},{-2,2},{0,-2},{1,-2},{2,-2},{-1,-2},{-2,-2},{2,0},{2,1},{2,-1},{-2,0},{-2,1},{-2,-1}};
        int x, y;
        for(int[] query: queries) 
        {
            int sum = 0;
            if(query[0] == 1) {
                for(int i = 0; i < 8; i++) 
                {
                    x = query[1] + dir1[i][0];
                    y = query[2] + dir1[i][1];
                    if(x >= 0 && x < n && y >= 0 && y < m) sum += mat[x][y];
                }
            }
            else 
            {
                for(int i = 0; i < 16; i++) 
                {
                    x = query[1] + dir2[i][0];
                    y = query[2] + dir2[i][1];
                    if(x >= 0 && x < n && y >= 0 && y < m) sum += mat[x][y];
                }
            }
            ans.add(sum);
        }
        return ans;
    }
}
