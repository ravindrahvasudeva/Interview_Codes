public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int temp=x,sum=0;
        while(temp>0){
            int r=temp%10;
            sum=(sum*10)+r;
            temp/=10;
        }
        if(x==sum){
            return true;
        }
        else{
            return false;
        }
  }
}
