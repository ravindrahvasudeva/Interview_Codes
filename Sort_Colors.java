public class Sort_Colors {
        public void sortColors(int[] nums) {
            int lo = 0;                         //low pointer
            int hi = nums.length - 1;          //high pointer
            int mid = 0;                       //middle pointer
            int temp;                          //temp variable for swaping
            while (mid <= hi) { 
                switch (nums[mid]) {            //takes mid value as parameter
                    case 0: { 
                        temp = nums[lo]; 
                        nums[lo] = nums[mid]; 
                        nums[mid] = temp; 
                        lo++; 
                        mid++; 
                        break; 
                    } 
                    case 1: 
                        mid++; 
                        break; 
                    case 2: { 
                        temp = nums[mid]; 
                        nums[mid] = nums[hi]; 
                        nums[hi] = temp; 
                        hi--; 
                        break; 
                    } 
                } 
            }
        }
    }
    /*
    -----Sort Colors-------
    
    
    Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
    
    We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
    
    You must solve this problem without using the library's sort function.
    
     
    
    Example 1:
    
    Input: nums = [2,0,2,1,1,0]
    Output: [0,0,1,1,2,2]
    
    Example 2:
    
    Input: nums = [2,0,1]
    Output: [0,1,2]
     */