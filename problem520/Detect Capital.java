class Solution {
    public boolean detectCapitalUse(String word) {
        int len=word.length();
        if(len==1) return true;
        int low=0,up=0;
        for(int i=0;i<len;i++){
            if(word.charAt(i)<=90&&word.charAt(i)>=65) up++;
            if(word.charAt(i)<=122&&word.charAt(i)>=97) low++;
        }
        if(up==len||low==len) return true;
        if(up==1&&low>0){
            if(word.charAt(0)-97<0) return true;
            else return false;
        }
        return false;
    }
}
