class Solution {
    public int numJewelsInStones(String J, String S) {
        int lenj=J.length(),lens=S.length();
        int result=0;
        for(int i=0;i<lenj;i++){
            for(int j=0;j<lens;j++){
                if(J.charAt(i)==S.charAt(j)) result++;
            }
        }
        return result;
    }
}
