class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        int[] result=new int[2];
        int len=S.length();
        int line=1,temp=0,curr=0;
        for(int i=0;i<len;i++){
            temp =S.charAt(i)-97;
            if(curr+widths[temp]>100){
                line++;
                curr=widths[temp];
                continue;
            }
            if(curr+widths[temp]==100){
                line++;
                curr=0;
                continue;
            }
            if(curr+widths[temp]<100){
                curr+=widths[temp];
                continue;
            }
        }
        result[0]=line;
        result[1]=curr;
        return result;
    }
}
