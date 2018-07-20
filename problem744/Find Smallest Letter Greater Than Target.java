class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char re=letters[0];
        int len=letters.length;
        for(char c:letters){
            if(c>target){
                re=c;
                break;
            }
        }
        return re;
    }
}
