class Solution {
    public int[] plusOne(int[] digits) {
        int len=digits.length;
        int carry=1;            //store the initial 1
        int temp=0;            //store the plused number for each digit
        int[] result=new int[len+1];  //reserve one more place for the head digit's carry
        for(int i=len-1;i>=0;i--){
            temp=digits[i]+carry;
            digits[i]=temp%10;
            if(temp==10) carry=1;
            else carry=0;
        }
        if(carry==0) return digits;
        else{
            result[0]=1;
            for(int j=result.length-1;j>=1;j--){
                result[j]=digits[j-1];
            }
            return result;
        }
    }
}
