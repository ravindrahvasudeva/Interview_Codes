class Solution {
    public int numIslands(char[][] grid) {
     int count=0;
     for(int i=0; i <grid.length; i++){            //columns
         for(int j=0; j<grid[i].length; j++){     //rows
             if(grid[i][j]=='1'){
                 count++;                        
                 calldfs(grid, i, j);  
             }
         }
     }   return count;
 }
 public void calldfs(char[][] grid, int i, int j){
     int m=grid.length;
     int n=grid[0].length;
  
     if(i<0||i>=m||j<0||j>=n||grid[i][j]!='1')//boundaru check
         return;
  
     grid[i][j]='X';
  
     calldfs(grid, i-1, j);//down
     calldfs(grid, i+1, j);//up
     calldfs(grid, i, j-1);//left
     calldfs(grid, i, j+1);//right
 }
 }