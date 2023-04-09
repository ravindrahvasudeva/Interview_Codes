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