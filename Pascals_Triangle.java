public class Pascals_Triangle {
        public List<List<Integer>> generate(int numRows) {
        
            if(numRows==0) return new ArrayList();    //if i/p is zero then return empty list
            List<List<Integer>> ans =new ArrayList();
            for(int i=1;i<=numRows;i++){
                List<Integer> row = new ArrayList();
                for(int j=0;j<i;j++){
                    if(j==0||j==(i-1)){        //if the index value is first and last value then Add 1
                        row.add(1);
                    }else{
                    row.add(ans.get(i-2).get(j)+ans.get(i-2).get(j-1));} //else do the things mentioned below
                }
                ans.add(row);
            }
            return ans;
        
    }}
    
/* 
    ----------------------------------------------------------------------
     Explanation
      List Index       row
           0            1
           1            2
           2            3   
           3            4
           4            5
    
           now for 5 ROWS we have 5 index value if we want to go to specific row we can acess two no less that is list index 
           eg if we want row 4 then we need to access list index 2(row-2=listindex) 
    
           suppose if we want 5 row
           then,
           4 row that is 3 index will be considered where
            indexes:-
            0+1(4row)=1(5row)
            1+2=2
            2+3=3
    -----------------------------------------------------------------------
    Question
    
     Pascal's Triangle
     Given an integer numRows, return the first numRows of Pascal's triangle.
    
    In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
    
    Example 1:
    
    Input: numRows = 5
    Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
    
    Example 2:
    
    Input: numRows = 1
    Output: [[1]]
    
    
    
    
    
    
    
  */  

