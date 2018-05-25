class Solution {
    public int missingNumber(int[] nums) {
        int sum=0,supp=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            supp+=i;
        }
        supp+=nums.length;
        return supp-sum;
    }
}
