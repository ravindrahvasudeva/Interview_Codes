public class 3Sum {
    public List<List<Integer>> threeSum(int[] n) {
        
        Arrays.sort(n);
        
        List<List<Integer>> res = new LinkedList<>(); 
        
        for (int i = 0; i < n.length-2; i++) {
            
            if (i == 0 || (i > 0 && n[i] != n[i-1])) {
                
                int lowp = i+1, highp = n.length-1, sum = - n[i];
                
                while (lowp < highp) {
                    if (n[lowp] + n[highp] == sum) {
                        
                        res.add(Arrays.asList(n[i], n[lowp], n[highp]));
                        
                        while (lowp < highp && n[lowp] == n[lowp+1]) lowp++;
                        while (lowp < highp && n[highp] == n[highp-1]) highp--;
                        
                        lowp++; highp--;
                    } 
                    else if (n[lowp] + n[highp] < sum) lowp++;
                    
                    else highp--;
               }
            }
        }
        return res;
    }
}
/*
  ---------------3Sum-----------------------------

  Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
  
  --------------------------------------
  Approach: -
  consider that we want a+b+c=0
  by simple process of sendind a to RHS we can obtain the result for above problem 
  thet is => [b+c=-(a)]   // * a is nothing but sum(variable) in above problem
  -----------------------------------------
  
  /*
  ---------------3Sum-----------------------------

  Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
  
  --------------------------------------
  Approach: -
  consider that we want a+b+c=0
  by simple process of sendind a to RHS we can obtain the result for above problem 
  thet is => [b+c=-(a)]   // * a is nothing but sum(variable) in above problem
  -----------------------------------------
  
Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.

Example 2:
Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.

Example 3:
Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.
  
   */  