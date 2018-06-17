class Solution {
    public int findComplement(int num) {
        StringBuilder sb=new StringBuilder();
        String snum=Integer.toBinaryString(num);
        for(int i=0;i<snum.length();i++){
            if(snum.charAt(i)=='0') sb.append('1');
            else sb.append('0');
        }
        return Integer.parseInt(sb.toString(),2);
    }
}
