class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int n=numCourses;
        int m=prerequisites.length;
        int[] indeg=new int[n];
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        for(int i=0;i<n;i++){
            for(int it:adj.get(i)){
                indeg[it]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indeg[i]==0)
                q.add(i);    
        }
        int[] topo=new int[n];
        int indx=0;
        while(!q.isEmpty()){
            int node=q.peek();
                topo[indx]=node;
            indx++;
            q.remove();
            for(int it: adj.get(node)){
                indeg[it]--;
                if(indeg[it]==0)
                    q.add(it);
            }
        }
        if(indx==n)
            return topo;
        int[] arr={};
        return arr;
    }
}