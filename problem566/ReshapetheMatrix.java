class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int nr=nums.length;
        int nc=nums[0].length;
        if(r*c!=nr*nc) return nums;
        int[][] result=new int[r][c];
        int index=0;
        for(int i=0;i<nr;i++){
            for(int j=0;j<nc;j++){
                result[index/c][index%c]=nums[i][j];
                index++;
            }
        }
        return result;
    }
}
