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
   