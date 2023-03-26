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
