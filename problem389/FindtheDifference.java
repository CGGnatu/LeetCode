class Solution {
    public char findTheDifference(String s, String t) {
        int slen=s.length();
        int tlen=t.length();
        int scode=0,tcode=0;
        for(int i=0;i<slen;i++) scode+=s.charAt(i);
        for(int j=0;j<tlen;j++) tcode+=t.charAt(j);
        return (char)(tcode-scode);
    }
}
