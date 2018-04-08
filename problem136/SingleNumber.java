class Solution {
    public int singleNumber(int[] nums) {
        int len=nums.length;
        int result=0;
        Arrays.sort(nums);
        if(len==1) result=nums[0];
        else{
            for(int i=0;i<len-1;i=i+2){
                if(nums[i]!=nums[i+1]){
                    result=nums[i];
                    break;
                }
            }
            if(nums[len-2]<nums[len-1]) result=nums[len-1];
        }
        return result;
    }
}
