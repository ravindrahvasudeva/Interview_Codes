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
