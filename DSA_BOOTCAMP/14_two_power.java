static int solve(int n){
    //CODE HERE 
    int res = n & (n-1); 
    if(res == 0) 
    return 1;
     else 
     return 0;
    }