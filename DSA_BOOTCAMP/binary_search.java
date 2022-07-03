static int solve(int n, int[] nums, int target){
    //CODE HERE 
    int right =0;
       int last=n-1;
       while(right<=last){
           int mid=(right+last)/2;
                  if(nums[mid]==target) return mid;
           if(nums[mid]>target){
               last=mid-1;
           }else{
               right=mid+1;
           }
           
       }
       return -1;
    }