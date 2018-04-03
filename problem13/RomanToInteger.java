class Solution {
    public int romanToInt(String s) {
        int len=s.length();    
        int result=0;                //store the integer converted from Roman number in result
        int[] digi=new int[len+1];    //store the every digit of the Roman number in digi[]
        digi[len]=0;                  //the length of digi[] is 1 more than String s,and the end of digi[] is setted to 0, in order to solve
        for(int i=0;i<len;i++){       //the problem of out of the bound of the digi[] index in the second loop
            if(s.charAt(i)=='I') digi[i]=1;
            else if(s.charAt(i)=='V') digi[i]=5;
            else if(s.charAt(i)=='X') digi[i]=10;
            else if(s.charAt(i)=='L') digi[i]=50;
            else if(s.charAt(i)=='C') digi[i]=100;
            else if(s.charAt(i)=='D') digi[i]=500;
            else if(s.charAt(i)=='M') digi[i]=1000;
        }
        for(int j=0;j<len;j++){
           if(digi[j]<digi[j+1]) digi[j]=-1*digi[j];
           result=result+digi[j];
         }
        return result;
     }
}
