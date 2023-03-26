public class Pow {
        public double myPow(double x, int n) {
       double ans = 1.0;
       long numb=n;
       if(numb<0) numb=-1*numb;//converting -ve to +ve to stop overflow
       while(numb>0){
           if(numb%2==1){          //odd
               ans=ans*x;
               numb=numb-1;
           }
           else{                  //even
                x=x*x;
               numb=numb/2;          
           }    
       }
       if(n<0) ans=(double)(1.0)/(double)(ans);
       return ans;
    }
}

/*
-------------- Pow(x, n)--------------- 

Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

Example 1:
Input: x = 2.00000, n = 10
Output: 1024.00000

Example 2:
Input: x = 2.10000, n = 3
Output: 9.26100

Example 3:
Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25


*/