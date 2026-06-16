// Construct List using XOR Queries

class Solution {
    public ArrayList<Integer> constructList(int[][] queries) {
        // code here
        int xor = 0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        int q = queries.length;
        for(int i=0;i<q;i++){
            if(queries[i][0] == 0){
                list.add(queries[i][1]^xor);
            }
            else{
                xor ^= queries[i][1];
            }
        }
        for(int i = 0;i<list.size();i++){
            list.set(i,xor^list.get(i));
        }
        Collections.sort(list);
        return list;
    }
}
