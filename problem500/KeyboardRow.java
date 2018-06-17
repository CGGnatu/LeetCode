class Solution {
    public String[] findWords(String[] words) {
        List<String> result=new ArrayList<>();
        for(String str:words){
            if(judgeWord(str)) result.add(str);
        }
        return result.toArray(new String[result.size()]);
    }
    
    public boolean judgeWord(String s){
        String row1="qwertyuiopQWERTYUIOP";
        String row2="asdfghjklASDFGHJKL";
        String row3="zxcvbnmZXCVBNM";
        boolean result=true;
        if(row1.contains(String.valueOf(s.charAt(0)))){
            for(int i=1;i<s.length();i++){
                if(!row1.contains(String.valueOf(s.charAt(i)))){
                    result=false;
                    break;
                }
            }
        }
        if(row2.contains(String.valueOf(s.charAt(0)))){
            for(int i=1;i<s.length();i++){
                if(!row2.contains(String.valueOf(s.charAt(i)))){
                    result=false;
                    break;
                }
            }
        }
        if(row3.contains(String.valueOf(s.charAt(0)))){
            for(int i=1;i<s.length();i++){
                if(!row3.contains(String.valueOf(s.charAt(i)))){
                    result=false;
                    break;
                }
            }
        }
        return result;
    }
}
