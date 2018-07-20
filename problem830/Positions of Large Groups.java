class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> re=new ArrayList();
        int len=S.length();
        int count=1;
        for(int i=1;i<len;i++){
            List<Integer> sub=new ArrayList();
            if(S.charAt(i)==S.charAt(i-1)) count++;
            if(S.charAt(i)!=S.charAt(i-1)){
                if(count<3) count=1;
                else{
                    sub.add(i-count);
                    sub.add(i-1);
                    re.add(sub);
                    count=1;
                }
            }
            if(i==len-1&&count>=3){
                sub.add(len-count);
                sub.add(len-1);
                re.add(sub);
            }
        }
        return re;
    }
}
