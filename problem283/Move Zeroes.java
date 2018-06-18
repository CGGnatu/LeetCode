class Solution {
    public void moveZeroes(int[] nums) {
        int pointer=0;
        for(int num:nums){
            if(num!=0) nums[pointer++]=num;
        }
        while(pointer<nums.length) nums[pointer++]=0;
    }
}
