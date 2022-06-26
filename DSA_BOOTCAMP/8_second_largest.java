
static int solve(int n, int[] arr){
    //CODE HERE 
    Arrays.sort(arr);
        ArrayList<Integer>res = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(!res.contains(arr[i]))
            {
                res.add(arr[i]);
            }
        } 
        if(res.size()==1 || res.size()==2)
        {
            int n1=res.get(0);
            return n1;
        }
            int n2=res.get(res.size()-2);
            return n2;
        }
    