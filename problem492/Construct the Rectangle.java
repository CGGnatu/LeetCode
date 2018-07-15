class Solution {
    public int[] constructRectangle(int area) {
        int re[]=new int[2];
        int L=0,W=0;
        int min=Integer.MAX_VALUE;
        for(int w=1;w<=Math.sqrt(area);w++){
            int diff=0,l=0;
            if(area%w==0){
                l=area/w;
                if(l>=w){
                    diff=l-w;
                    if(diff<min){
                        min=diff;
                        L=l;
                        W=w;
                    }
                }
            }
        }
        re[0]=L;
        re[1]=W;
        return re;
    }
}
