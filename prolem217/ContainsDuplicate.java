class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean result=false;
        if(nums.length==0||nums.length==1) return result;
        Arrays.sort(nums);                 //sort the array so that duplicate numbers are next to each other
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                result=true;
                break;
            }
        }
        return result;
    }
}
