class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet h1=new HashSet<>();
        HashSet h2=new HashSet<>();
        for(int i:nums1) h1.add(i);
        for(int j:nums2){
            if(h1.contains(j)) h2.add(j);
        }
        int re[]=new int[h2.size()];
        Iterator it=h2.iterator();
        int i=0;
        while(it.hasNext()){
            re[i]=(int) it.next();
            i++;
        }
        return re;
    }
}
