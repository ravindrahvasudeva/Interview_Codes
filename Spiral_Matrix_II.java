public class Spiral_Matrix_II {
   
        public int[][] generateMatrix(int n) {
             int l=0,r=n-1,t=0,b=n-1,d=0;//direction=d
             int num=1;
             int[][] matrix = new int[n][n];
            while(l<=r && t<=b){
                if(d==0){
                    for(int i=l;i<=r;i++){                      //looping cylically all nodes using d as the parameter
                        matrix[t][i]=num;num++;
                    }d=1;t++;
                }
                else if(d==1){
                    for(int i=t;i<=b;i++){
                    matrix[i][r]=num;num++;
                    }d=2;r--;
                }
                else if(d==2){
                     for(int i=r;i>=l;i--){
                    matrix[b][i]=num;num++;
                    }d=3;b--;
                }
                else if(d==3){ for(int i=b;i>=t;i--){
                    matrix[i][l]=num;num++;
                    }d=0;l++;}
            }
            return matrix;
        }
    
}
/*
  Spiral Matrix II
  Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
  
Example 1:

Input: n = 3
Output: [[1,2,3],[8,9,4],[7,6,5]]


Example 2:

Input: n = 1
Output: [[1]]
 */
