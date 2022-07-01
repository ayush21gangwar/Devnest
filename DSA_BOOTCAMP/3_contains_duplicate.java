static int solve(int n, int[] arr){
    //CODE HERE 
     HashMap <Integer,Integer> hm = new HashMap<>();
        for(int a : arr){
            if(!hm.containsKey(a)){
                hm.put(a,1);
            }
            else{
                return 1;
            }
        }
        return 0;
    
    }
