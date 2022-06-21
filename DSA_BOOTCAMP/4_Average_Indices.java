static float solve(int n, int[] arr, int x, int y){
    //CODE HERE 
    int add=0;
    for(int i=x;i<=y;i++)
    add+=arr[i];
    return(float)(add*1.0/(y-x+1));
    }
