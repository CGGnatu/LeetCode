class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int len=nums.length;
        if(len==1) return 1;
        int re=0;
        int count=1;
        for(int i=1;i<len;i++){
            if(nums[i]>nums[i-1]) count++;
            if(nums[i]<=nums[i-1]){
                if(re<=count){
                    re=count;
                    count=1;
                }
                else count=1;
            }
            if(i==len-1){
                if(re<=count) re=count;
            }
        }
        return re;
    }
}
