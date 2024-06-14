class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        ArrayList<ArrayList<Integer>>adr=new ArrayList<>();
        int V=graph.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<V;i++){
            adr.add(new ArrayList<>());
        }
         int[] ind=new int[V];
        for(int i=0;i<V;i++){
            for(int it: graph[i]){
                adr.get(it).add(i);
                ind[i]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
    for(int i=0;i<V;i++){
        if(ind[i]==0){
            q.add(i);
        }
    }
        while(!q.isEmpty()){
            int node=q.peek();
            q.remove();
            list.add(node);
            for(int it: adr.get(node)){
                ind[it]--;
                if(ind[it]==0)
                    q.add(it);
            }
        }
        Collections.sort(list);
        return list;
    }
} 