class Solution {
    public int islandPerimeter(int[][] grid) {
        int result=0;
        int count=0;
        int height=grid.length,width=grid[0].length;
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                if(grid[i][j]==1){
                    result++;
                    if(i-1>=0&&grid[i-1][j]==1) count++;
                    if(i+1<height&&grid[i+1][j]==1) count++;
                    if(j-1>=0&&grid[i][j-1]==1) count++;
                    if(j+1<width&&grid[i][j+1]==1) count++;
                }
            }
        }
        return result*4-count;
    }
}
