class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> l=new ArrayList();
        int len1=nums1.length;
        int len2=nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int pointer=0;
        if(len1<=len2){
            for(int i=0;i<len1;i++){
                for(int j=pointer;j<len2;j++){
                    if(nums1[i]==nums2[j]){
                        l.add(nums1[i]);
                        pointer=j+1;
                        break;
                    }
                    else continue;
                }
            }
        }
        else{
            for(int i=0;i<len2;i++){
                for(int j=pointer;j<len1;j++){
                    if(nums1[j]==nums2[i]){
                        l.add(nums1[j]);
                        pointer=j+1;
                        break;
                    }
                    else continue;
                }
            }
        }
        int[] re=new int[l.size()];
        for(int i=0;i<l.size();i++){
            re[i]=l.get(i);
        }
        return re;
    }
}
