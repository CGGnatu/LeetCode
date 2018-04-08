class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len=strs.length;                        
        String result="";             //set default value of result
        if(len==0) result="";
        else if(len==1)  result=strs[0];
        else{
            String sstr=strs[0];              //store the shortest string  
            for(int k=0;k<len;k++){           //first loop, to find the shortest string
                if(sstr.length()>=strs[k].length()){
                    sstr=strs[k];
                }
            }
            for(int i=0;i<sstr.length();i++){      //outer loop, to scan the every possible prefix string of sstr
                String subsstr=sstr.substring(0,i+1);
                int count=0;                  //count the number of strings in strs[] which have the prefix above,untill meet the one has not
                for(int j=0;j<len;j++){               //inner loop, to check every string in strs[] 
                   if(strs[j].startsWith(subsstr)) count++;    
                    else break;                          //once there is a string does not match the if-statement, then break inner loop
                }
                if(count!=len) break;          //if there is any string in strs[] has not the prefix above, then break loop, return result
                else result=subsstr;
            }
        }
        return result;
    }
}  
