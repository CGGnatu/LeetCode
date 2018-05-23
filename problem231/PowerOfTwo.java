class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean result=true;
        if(n==0) return false;
        if(n==1) return true;
        if(n%2!=0) return false;
        if(n%2==0){
            while(result){
                n=n/2;
                if(n==1) break;
                if(n%2==0) result=true;
                if(n%2!=0) result=false;
            }
        }
        return result;
    }
}
