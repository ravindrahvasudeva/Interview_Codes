public class removeDuplicates {
    public int removeDuplicates(int[] nums) {

        if(nums.length == 0) return 0;
        int start=0;
        for(int k=1;k<nums.length;k++){
            if(nums[k]!=nums[start]){
                start++;
               nums[start]=nums[k];
            }
        }
        
        return start+1;
    }
}
