class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i=0;i<A.length;i++){
            flip(A[i]);
            for(int j=0;j<A[i].length;j++){
                if(A[i][j]==1) A[i][j]=0;
                else A[i][j]=1;
            }
        }
        return A;
    }
    public int[] flip(int[] a){
        int len=a.length;
        int temp=0;
        for(int i=0;i<len/2;i++){
            temp=a[i];
            a[i]=a[len-1-i];
            a[len-1-i]=temp;
        }
        return a;
    }
}
