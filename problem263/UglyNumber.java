class Solution {
    public boolean isUgly(int num) {
        if(num<=0||num==7) return false;
        if(num<=10) return true;
        if(num%2==0) return isUgly(num/2);
        if(num%3==0) return isUgly(num/3);
        if(num%5==0) return isUgly(num/5);
        else return false;
    }
}
