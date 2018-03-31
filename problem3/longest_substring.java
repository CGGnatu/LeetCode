class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=0,result=0;
        for(int j=0;j<s.length();j++){
            String substr="";
            for(int i=j;i<s.length();i++){
                if(!substr.contains(String.valueOf(s.charAt(i)))){
                   substr=substr+s.charAt(i);
                    len=substr.length();
                    if(len>result) result=len;
                }
            }
        }
        return result;
    }
}