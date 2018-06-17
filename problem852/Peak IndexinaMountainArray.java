class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int result=0;
        for(int i=0;i<A.length-1;i++){
            if(A[i]<A[i+1]) continue;
            if(A[i]>A[i+1]){
                result=i;
                break;
            }
        }
        return result;
    }
}
