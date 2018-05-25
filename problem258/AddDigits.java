class Solution {
    public int addDigits(int num) {
        if(num<10) return num;
        int result=0;
        while(num!=0){
            if(num<10) result+=num;
            else result+=num%10;
            num=num/10;
        }
        return addDigits(result);
    }
}
