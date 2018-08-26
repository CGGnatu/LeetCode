class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ave=0,sum=0,max=Integer.MIN_VALUE;
        int len=nums.length;
        int count=0;
        for(int i=0;i<len;i++){
            sum+=nums[i];
            count++;
            if(count<k) continue;
            else if(count==k){
                ave=sum/k;
                if(ave>=max) max=ave;
            }
            else{
                sum-=nums[i-k];
                ave=sum/k;
                if(ave>=max) max=ave;
            }
        }
        return max;
    }
}
