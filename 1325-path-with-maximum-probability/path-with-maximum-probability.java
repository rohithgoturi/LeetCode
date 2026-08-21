class Solution {
    class Pair implements Comparable<Pair> {
        int node;
        double prob;

        Pair(int node, double prob){
            this.node = node;
            this.prob = prob;
        }

        public int compareTo(Pair p){
            if(this.prob == p.prob) return this.node - p.node;

            return Double.compare(this.prob, p.prob);
        }
    }

    public double maxProbability(int n, int[][] edges, double[] sProb, int start, int end) {
        List<List<Pair>> adj = new ArrayList<>();

        for(int i=0; i<n; i++) adj.add(new ArrayList<>());

        for(int i=0; i<edges.length; i++){
            int a = edges[i][0];
            int b = edges[i][1];
            double prob = sProb[i];

            adj.get(b).add(new Pair(a, prob));
            adj.get(a).add(new Pair(b, prob));
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        double[] maxSucc = new double[n];
        Arrays.fill(maxSucc, 0.0);
        maxSucc[start] = 1;

        pq.add(new Pair(start, 1));

        while(!pq.isEmpty()){
            Pair x = pq.remove();
            int u = x.node;
            double prob = x.prob;

            if(prob < maxSucc[u]) continue;
            for(Pair ele : adj.get(u)){
                int v = ele.node;
                double pro = ele.prob;
                double sp = maxSucc[u] * pro;

                if(sp > maxSucc[v]){
                    maxSucc[v] = sp;
                    pq.add(new Pair(v, maxSucc[v]));
                } 
            }
        }

        return maxSucc[end];

    }
}