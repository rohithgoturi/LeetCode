class Solution {

    class Pair{
        int node;
        int time;
        
        Pair(int node, int time){
            this.node = node;
            this.time = time;
        }
    }

    public int networkDelayTime(int[][] times, int V, int src) {

        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i=0; i<=V; i++) adj.add(new ArrayList<>());
        
        for(int i=0; i<times.length; i++){
            int a = times[i][0];
            int b = times[i][1];
            int time = times[i][2];
            
            adj.get(a).add(new Pair(b, time));
        }
        
        int[] time = new int[V+1];
        Arrays.fill(time, Integer.MAX_VALUE);
        
        PriorityQueue <Pair> pq = new PriorityQueue<>((a,b) -> a.time - b.time);
        
        time[src] = 0; 
        pq.add(new Pair(src, 0));
        
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            int u = curr.node;
            int t = curr.time;
            
            if(t>time[u]) continue;
            
            for(Pair ele : adj.get(u)){
                int v = ele.node;
                int tym = ele.time;
                int totalTime = time[u] + tym;

                if(totalTime < time[v]){
                    time[v] = totalTime;
                    pq.add(new Pair(v, time[v]));
                }
            }
        }
        
        int max = 0;
        for(int i=1; i<time.length; i++){
            if(time[i] == Integer.MAX_VALUE) return -1;
            max = Math.max(max, time[i]);
        }

        return max;
    }
}