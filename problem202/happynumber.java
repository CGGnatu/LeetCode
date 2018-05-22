class Solution {
    public boolean isHappy(int n) {
        int result=0;
        while(n!=0){
            result+=(n%10)*(n%10);
            n=n/10;
        }
        if(result==1) return true;
        if(result<10&&result!=7) return false;
        else return isHappy(result);
    }
}
