class Solution {
    public int mySqrt(int x) {
        int result=0;
        long lx=x;
        if(x==0||x==1) result=x;
        else{
            for(long i=1;i<lx;i++){
                long temp1=i*i, temp2=(i+1)*(i+1);
                if(temp1<=lx&&temp2>lx){
                    result=(int)i;
                    break;
                }
            }
        }
        return result;
    }
}
