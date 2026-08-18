class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination) return true;

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i=0; i<n; i++){
            ArrayList<Integer> arr = new ArrayList<>();
            ans.add(arr);
        }

        for(int i=0; i<edges.length; i++){
            int a = edges[i][0];
            int b = edges[i][1];

            ans.get(a).add(b);
            ans.get(b).add(a);
        }

        boolean[] vis = new boolean[n];
        bfs(source, ans, vis, destination);

        return vis[destination];

    }

    public void bfs(int start, ArrayList<ArrayList<Integer>> ans, boolean[] vis, int end){
        vis[start] = true;

        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        while(!q.isEmpty()){
            int front = q.remove();
            for(int ele : ans.get(front)){
                if(!vis[ele]){
                    q.add(ele);
                    vis[ele] = true;

                    if(ele == end) return;
                }
            }
        }
    }
}