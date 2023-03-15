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

 /*
  #Number of Islands
An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

Example 1:

Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1


Example 2:

Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3
  */