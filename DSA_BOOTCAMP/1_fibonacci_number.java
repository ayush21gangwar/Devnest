public static int solve(int n){
    //CODE HERE 
     if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        else
        {
            return solve(n-1)+solve(n-2);
    }
    } 


