class Solution {
    public int hammingDistance(int x, int y) {
        int a=0;
        int result=0;
        String snum="";
        a=x^y;
        snum=Integer.toBinaryString(a);
        for(int i=0;i<snum.length();i++){
            if(snum.charAt(i)=='1') result++;
        }
        return result;
    }
}
