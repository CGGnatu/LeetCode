class Solution {
    public String licenseKeyFormatting(String S, int K) {
        String str=S.replaceAll("-","").toUpperCase();
        int first=0;
        int len=str.length();
        if(len<=K) return str;
        first=len%K;
        StringBuilder sb=new StringBuilder(str);
        if(first!=0){
            sb.insert(first,"-");
            first++;
        }
        int count=0;
        for(int i=first;i<sb.length()-1;i++){
            count++;
            if(count==K){
                sb.insert(i+1,"-");
                count=0;
                i++;
            }
        }
        return sb.toString();
    }
}
