class Solution {
    public int strStr(String haystack, String needle) {
        int result=0;
        if(!haystack.contains(needle)) result=-1;
        else{
            result=haystack.indexOf(needle);
        }
        return result;
    }
}
