
static int solve(String str){
    //CODE HERE 
     Stack<Character> stk=new Stack<>();
    
        for(int i=0;i<str.length();i++){
            if(stk.size()>0 && str.charAt(i)==')'  ){
                  if(stk.pop()!='(') return 0;  
            }
            else if(stk.size()>0 && str.charAt(i)==']'  ){
                  if(stk.pop()!='[') return 0;  
            }
            else if(stk.size()>0 && str.charAt(i)=='}'  ){
                  if(stk.pop()!='{') return 0;  
            }else{
                stk.push(str.charAt(i));
            }
        } 
      
        if(stk.size()>0) return 0;
       return 1;
    }