class Solution {
    public int majorityElement(int[] nums) {
        int len=nums.length;
        int result=0,temp=1;
        if(len==1) return nums[0];
        Arrays.sort(nums);
        for(int i=0;i<len-1;i++){
            if(nums[i]==nums[i+1]) temp++;
            if(temp>len/2){
                result=nums[i];
                break;
            }
            if(nums[i]!=nums[i+1]) temp=1;
        }
        return result;
    }
}
