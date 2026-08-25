class Solution {
    class Triplet implements Comparable<Triplet>{
        int node;
        int parent;
        int dist;

        public Triplet(int node, int parent, int dist){
            this.node = node;
            this.parent = parent;
            this.dist = dist;
        }

        public int compareTo(Triplet t){
            if(this.dist == t.dist) Integer.compare(this.node, t.node);

            return Integer.compare(this.dist, t.dist);
        }
    }

    public int minCostConnectPoints(int[][] points) {
        int n = points.length;

        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        pq.add(new Triplet(0, -1, 0));
        int sum = 0;

        boolean[] vis = new boolean[n];

        while(!pq.isEmpty()){
            Triplet tr = pq.remove();
            int node = tr.node;
            int parent = tr.parent;
            int dist = tr.dist;

            if(vis[node] == true) continue;
            vis[node] = true;
            sum += dist;

            for(int i=0; i<n; i++){
                if(i==parent || i==node) continue;
                if(vis[i] == true) continue;

                int x1 = points[i][0];
                int y1 = points[i][1];

                int x2 = points[node][0];
                int y2 = points[node][1];

                int mDis = Math.abs(x2-x1) + Math.abs(y2-y1);
                pq.add(new Triplet(i,node,mDis));
            }
        }

        return sum;
    }
}