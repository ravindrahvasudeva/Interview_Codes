public class AddBinary {
    public String addBinary(String A, String B) {
        int i = A.length()-1;
       int j = B.length()-1;
       int carry = 0;
       int sum = 0;
       StringBuilder result =  new StringBuilder();
       while(i>=0 || j>=0 || carry == 1){
           sum = carry;
           if(i>=0) sum = sum+A.charAt(i)-'0';
           if(j>=0) sum = sum+B.charAt(j)-'0';
           result.append((sum%2));
           carry = sum/2;
           i--;
           j--;
       }
       return result.reverse().toString();
   }
}
/*
 ---------------Add Binary---------------

 Given two binary strings a and b, return their sum as a binary string.

 

Example 1:
Input: a = "11", b = "1"
Output: "100"

Example 2:
Input: a = "1010", b = "1011"
Output: "10101"

 */