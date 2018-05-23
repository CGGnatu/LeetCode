class Solution {
    public int[] convertToArray(String t){         //build a int array, same character to same number, different
        int[] n = new int[t.length()];            //to different
        n[0]=0;
        for(int i=1;i<t.length();i++){
            for(int j=0;j<i;j++){
                if(t.charAt(i)!=t.charAt(j)) n[i]=i;
                else{
                    n[i]=n[j];
                    break;
                }
            }
        }
        return n;
    }
    public boolean isIsomorphic(String s, String t) {
        if(s.equals("")&&(t.equals(""))) return true;
        if(Arrays.equals(convertToArray(s), convertToArray(t))) return true;
        else return false;
    }
}
