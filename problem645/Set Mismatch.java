class Solution {
    public int[] findErrorNums(int[] nums) {
        int len=nums.length;
        int[] re=new int[2];
        Arrays.sort(nums);
        for(int i=0;i<len-1;i++){
            if(nums[i+1]-nums[i]==0) re[0]=nums[i];
            else if(nums[i+1]-nums[i]>1){
                re[1]=nums[i+1]-1;
            }
        }
        if(nums[0]!=1) re[1]=1;
        else if(re[1]==0) re[1]=nums[len-1]+1;
        return re;
    }
}
