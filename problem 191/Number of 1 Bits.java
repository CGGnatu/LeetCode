public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        char[] ch=Integer.toBinaryString(n).toCharArray();
        int count=0;
        for(char c : ch){
            if(c=='1') count++;
        }
        return count;
    }
}
