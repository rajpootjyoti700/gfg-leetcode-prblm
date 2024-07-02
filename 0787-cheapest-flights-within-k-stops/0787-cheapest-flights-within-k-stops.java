class pair{
    int first;
    int second;
    public pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}

class tuple{
    int first;
    int second;
    int third;
    public tuple(int first,int second,int third){
        this.first=first;
        this.second=second;
        this.third=third;
    }
}

class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        // we will create the adj list which will contain the pair of node and distance 
        // inside the list of list
        ArrayList<ArrayList<pair>> adj=new ArrayList<>();
        int m=flights.length;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        //list containing pair of node and distance .
        for(int i=0;i<m;i++){
            adj.get(flights[i][0]).add(new pair(flights[i][1],flights[i][2]));
        }
        // now taking a queue of tuple 
        Queue<tuple> q=new LinkedList<>();
        q.add(new tuple(0,src,0));
        // create a distance array 
        int[] dist=new int[n];
        for(int i=0;i<n;i++){
            dist[i]=(int)(1e9);
        }
        dist[src]=0;
        while(!q.isEmpty()){
            tuple it=q.peek();
            q.remove();
            int stop=it.first;
            int node=it.second;
            int cost=it.third;
            if(stop>k)
                continue;
            
            for(pair itr: adj.get(node)){
                int adn=itr.first;
                int adw=itr.second;
                
                if(adw+cost<dist[adn] && stop<=k){
                    dist[adn]=adw+cost;
                    q.add(new tuple(stop+1,adn,adw+cost));
                }
            }
            
        }
        if(dist[dst] == (int)(1e9)) return -1; 
        return dist[dst]; 
    }
}