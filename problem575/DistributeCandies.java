class Solution {
    public int distributeCandies(int[] candies) {
        int len=candies.length;
        int number=len/2;
        Set set=new HashSet();
        for(int i=0;i<len;i++){
            if(set.size()<number) set.add(candies[i]);
            else break;
        }
        return set.size();
    }
}
