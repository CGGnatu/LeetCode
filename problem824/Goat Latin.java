class Solution {
    public String toGoatLatin(String S) {
        StringBuilder result=new StringBuilder();
        String[] words=S.split(" ");
        for(int i=0;i<words.length;i++){
            result.append(changeWord(words[i]));
            int temp=i+1;
            while(temp>0){
                result.append("a");
                temp--;
            }
            result.append(" ");
        }
        return result.toString().trim();
    }
    public String changeWord(String s){
        StringBuilder sb=new StringBuilder();
        char f=s.charAt(0);
        if(f=='a'||f=='A'||f=='e'||f=='E'||f=='i'||f=='I'||f=='o'||f=='O'||f=='u'||f=='U') sb.append(s+"ma");
        else sb.append(s.substring(1)+String.valueOf(f)+"ma");
        return sb.toString();
    }
}
