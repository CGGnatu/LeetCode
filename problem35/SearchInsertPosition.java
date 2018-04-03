class Solution {
    public int searchInsert(int[] nums, int target) {
        int result=0;
        int len=nums.length;
        if(nums[0]>=target) result=0;
        else if(nums[len-1]<target) result=len;
        else{
            for(int i=0;i<len-1;i++){
                if(target>nums[i]&&target<nums[i+1]) result=i+1;
                else if(target==nums[i+1]) result=i+1;
            }
        }
        return result;
    }
}
