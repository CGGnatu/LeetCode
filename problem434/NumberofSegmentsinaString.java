class Solution {
    public int countSegments(String s) {
        String[] a=s.split(" ");
        int result=0;
        for(int i=0;i<a.length;i++){
            if(!a[i].equals("")) result++;
        }
        return result;
    }
}
