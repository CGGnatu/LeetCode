class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        if(nums.length==1) sum=nums[0];
        else{
            int max=nums[0];
            for(int k=1;k<nums.length;k++){      //first loop, to find the biggest number in nums[]
                if(max<nums[k]) max=nums[k];
            }
            sum=max;
            for(int i=0;i<nums.length-1;i++){
                int temp=nums[i];
                for(int j=i+1;j<nums.length;j++){
                    temp=temp+nums[j];
                    if(temp>sum) sum=temp;
                }
            }
        }
        return sum;
    }
}
