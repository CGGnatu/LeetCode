class Solution {
    public boolean rotateString(String A, String B) {
        if(A.equals(B)) return true;
        boolean result=false;
        int len=A.length();
        String temp=A;
        for(int i=0;i<len;i++){
            temp=shiftString(temp);
            if(B.equals(temp)){
                result=true;
                break;
            }
        }
        return result;
    }
    public String shiftString(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.delete(0,1);
        sb.append(String.valueOf(s.charAt(0)));
        return sb.toString();
    }
}
