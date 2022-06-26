static int[] solve(String str1){
    //CODE HERE 
    LinkedHashMap<Character, Integer> hmap = new LinkedHashMap<Character,Integer>();
            for(int i=0;i<str1.length();i++)
            {
                if(hmap.containsKey(str1.charAt(i)))
                {
                    hmap.put(str1.charAt(i),hmap.get(str1.charAt(i))+1);
                }
                else
                {
                    hmap.put(str1.charAt(i),1);
                }
            }
            int res[]=new int[hmap.size()];
            int j=0;
            for(var i : hmap.values())
            {
                res[j++]=i;
            }
            return res;
        }
    
