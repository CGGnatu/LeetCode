class Solution {
    public boolean backspaceCompare(String S, String T) {
        String s=change(S);
        String t=change(T);
        return s.equals(t);
    }
    
    public String change(String str){
        StringBuffer sb=new StringBuffer();
        Stack stack=new Stack();
        int i=0;
        while(i<str.length()){
            if(str.charAt(i)=='#'){
               if(!stack.isEmpty()) stack.pop(); 
            }
            
            else stack.push(str.charAt(i));
            i++;
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
