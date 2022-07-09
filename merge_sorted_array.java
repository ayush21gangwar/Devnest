static int[] solve(int m, int n, int[] arr1, int[] arr2){
//CODE HERE 
  int[] temp1 = new int[m];
    for (int i = 0; i < m; i++) {
            temp1[i] = arr1[i];
    }
        
    int arrPtr = 0;
    int temp1Ptr = 0;
    int temp2Ptr = 0;
    while(temp1Ptr < m && temp2Ptr < n){
        if(temp1[temp1Ptr] < arr2[temp2Ptr]){
            arr1[arrPtr++] = temp1[temp1Ptr++];
        }
        else{
            arr1[arrPtr++] = arr2[temp2Ptr++];
        }
    }
    while(temp1Ptr < m){
        arr1[arrPtr++] = temp1[temp1Ptr++];
    }
    while(temp2Ptr < n){
        arr1[arrPtr++] = arr2[temp2Ptr++];
    }
    return arr1;
}