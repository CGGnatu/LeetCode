class Solution {
    public boolean isPalindrome(int x) {
        boolean result=false;      // store the return value
        if(x<0||x%10==0&&x!=0) result=false;    //
        else if(x==0) result=true;
        else if(x>0) {
            long px=x;              //store the initial value of x
            long lonx=0;           //store the reversed number of x
            while(x!=0){
                lonx=lonx*10+x%10;
                x=x/10;
            }
            if(lonx==px) result=true;
            else result=false;
        }
        return result;
    }
}
