class Solution {
    public boolean hasAlternatingBits(int n) {
        boolean result=true;
        String s=Integer.toBinaryString(n);
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                result=false;
                break;
            }
        }
        return result;
    }
}
