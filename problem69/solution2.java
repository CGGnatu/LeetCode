//Newton-Raphson method
class Solution {
    public int mySqrt(int x) {
        long r=0;    //store the result
        r=x;
        while(r*r>x){
            r=(r+x/r)/2;
        }
        return (int)r;
    }
}
