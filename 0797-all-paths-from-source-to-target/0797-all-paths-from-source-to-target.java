class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();    
        //apply dfs starting from 0th vertex.
        dfs(graph,0,ans,new ArrayList<>());
        return ans;
    }
    private void dfs(int[][] graph,int v,List<List<Integer>> ans,List<Integer> path) {
        //add current vertex to the path
        path.add(v);
        //once we reach destination, add path to the answer.
        if(v==graph.length-1) {
            ans.add(new ArrayList<>(path));
        } else {
            //else try for every neighbour
            for(int i=0;i<graph[v].length;i++) {
               dfs(graph,graph[v][i],ans,path);
            }
        }
        //backtrack to remove last vertex from current path
        path.remove(path.size()-1);
    }
}