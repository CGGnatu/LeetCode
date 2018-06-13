class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        int len=words.length;
        Set morseWords=new HashSet();
        for(int i=0;i<len;i++){
            morseWords.add(toMorse(words[i]));
        }
        return morseWords.size();
    }
    public String toMorse(String s){
        char[] word=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        int i=0;
        String[] mode={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        while(i<word.length){
            switch(word[i]){
                case 'a': sb.append(mode[0]);break;
                case 'b': sb.append(mode[1]);break;
                case 'c': sb.append(mode[2]);break;
                case 'd': sb.append(mode[3]);break;
                case 'e': sb.append(mode[4]);break;
                case 'f': sb.append(mode[5]);break;
                case 'g': sb.append(mode[6]);break;
                case 'h': sb.append(mode[7]);break;
                case 'i': sb.append(mode[8]);break;
                case 'j': sb.append(mode[9]);break;
                case 'k': sb.append(mode[10]);break;
                case 'l': sb.append(mode[11]);break;
                case 'm': sb.append(mode[12]);break;
                case 'n': sb.append(mode[13]);break;
                case 'o': sb.append(mode[14]);break;
                case 'p': sb.append(mode[15]);break;
                case 'q': sb.append(mode[16]);break;
                case 'r': sb.append(mode[17]);break;
                case 's': sb.append(mode[18]);break;
                case 't': sb.append(mode[19]);break;
                case 'u': sb.append(mode[20]);break;
                case 'v': sb.append(mode[21]);break;
                case 'w': sb.append(mode[22]);break;
                case 'x': sb.append(mode[23]);break;
                case 'y': sb.append(mode[24]);break;
                case 'z': sb.append(mode[25]);break;
            }
            i++;
        }
        return sb.toString();
    }
}
