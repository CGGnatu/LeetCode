class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] re=new int[nums1.length];
    out:for(int i=0;i<nums1.length;i++){
        in:for(int j=0;j<nums2.length;j++){
            re[i]=-1;
            int temp=0;
            if(nums1[i]==nums2[j]){
                temp=j+1;
                while(temp<nums2.length){
                    if(nums1[i]<nums2[temp]){
                        re[i]=nums2[temp];
                        break in;
                    }
                    temp++;
                    }
                } 
            }
        }
        return re;
    }
}
