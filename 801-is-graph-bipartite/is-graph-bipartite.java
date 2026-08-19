class Solution {
    static boolean ans;
    
    public boolean isBipartite(int[][] graph) {

        int n = graph.length;

        int[] visited = new int[n];
        Arrays.fill(visited, -1);

        ans = true;

        for (int i = 0; i < n; i++) {

            if (visited[i] == -1) {
                bfs(i, graph, visited);
            }

            if (!ans) {
                return false;
            }
        }

        return true;
    }

    public void bfs(int i, int[][] adj, int[] visited) {

        Queue<Integer> q = new LinkedList<>();

        visited[i] = 0;
        q.add(i);

        while (q.size() > 0) {

            int front = q.remove();

            int color = visited[front];

            for (int ele : adj[front]) {

                if (visited[ele] == visited[front]) {
                    ans = false;
                    return;
                }

                if (visited[ele] == -1) {
                    visited[ele] = 1 - color;
                    q.add(ele);
                }
            }
        }
    }
}