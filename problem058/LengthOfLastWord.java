class Solution {
    public int lengthOfLastWord(String s) {
        int result=0;
        if(!s.contains(" ")) result=s.length();    
        else{
            String[] word=s.split(" ");                    //split s into words store in array
            int len=word.length;
            for(int i=len-1;i>=0;i--){                         //loop to check the array of words in the reverse order
                if(!word[i].contains(" ")&&word[i]!=null){     
                    result=word[i].length();
                    break;                                     //once a word is found, break the loop
                }
            }
        }
        return result;
    }
}
