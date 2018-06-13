class Solution {
    public int arrayPairSum(int[] nums) {
        int len=nums.length;
        int result=0;
        Arrays.sort(nums);
        for(int i=0;i<len;i=i+2){
            result+=nums[i];
        }
        return result;
    }
}
