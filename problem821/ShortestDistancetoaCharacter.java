class Solution {
    public int[] shortestToChar(String S, char C) {
        int len=S.length();
        int[] result=new int[len];
        int pointer=-100000;
        for(int i=0;i<len;i++){
            if(S.charAt(i)==C) pointer=i;
            result[i]=i-pointer;
        }
        pointer=100000;
        for(int i=len-1;i>=0;i--){
            if(S.charAt(i)==C) pointer=i;
            result[i]=Math.min(result[i],pointer-i);
        }
        return result;
    }
}
