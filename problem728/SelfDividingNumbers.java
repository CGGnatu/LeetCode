class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> re=new ArrayList();
        for(int i=left;i<=right;i++){
            if(judgeNum(i)) re.add(i);
        }
        return re;
    }
    public boolean judgeNum(int n){
        if(n<10) return true;
        int count=0,temp=0,valid=0;
        do{
            temp=n%10;
            count++;
            if(temp==0) break;
            if(n%temp==0) valid++;
            n=n/10;
        }while(n>0);
        return valid==count;
    }
}
