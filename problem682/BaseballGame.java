class Solution {
    public int calPoints(String[] ops) {
        int result=0;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<ops.length;i++){
            int temp=0;
            switch(ops[i]){
                case "+":
                    list.add(list.get(list.size()-1)+list.get(list.size()-2));
                    break;
                case "D":
                    list.add(list.get(list.size()-1)*2);
                    break;
                case "C":
                    list.remove(list.size()-1);
                    break;
                default:
                    list.add(Integer.parseInt(ops[i]));
            }
        }
        for(int i=0;i<list.size();i++){
            result+=list.get(i);
        }
        return result;
    }
}
