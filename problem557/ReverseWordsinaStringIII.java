class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word:words){
            String temp=new StringBuilder(word).reverse().toString();
            result.append(temp);
            result.append(" ");
        }
        return result.toString().trim();
    }
}
