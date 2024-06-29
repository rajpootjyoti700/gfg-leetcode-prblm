class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        ArrayList<List<Integer>> adj =new ArrayList<>();
        // indeg nd toposort concept' store into adj list;
// make new empty list of list
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int[] ind=new int[n];
        for(int[] a: edges){
            adj.get(a[0]).add(a[1]);
            ind[a[1]]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(ind[i]==0){
                q.add(i);
            }
            }
        List<Set<Integer>> an=new ArrayList<>();
        for(int i=0;i<n;i++){
            an.add(new HashSet<>()); 
        }
        while(!q.isEmpty()){
            int u=q.poll();
            for(int v: adj.get(u)){
                ind[v]--;
                an.get(v).add(u);
                for (int a : an.get(u)) {
                    an.get(v).add(a);
                }
            
            if(ind[v]==0){
                q.add(v);
            }
        }
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
        List<Integer> list=new ArrayList<>(an.get(i));
            Collections.sort(list);
            ans.add(list);
        }
        return ans;
    }
} 