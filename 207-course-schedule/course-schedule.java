class Solution {
    public boolean canFinish(int n, int[][] pre) {
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            List<Integer> ans = new ArrayList<>();
            list.add(ans);
        }

        int[] indegree = new int[n];
        boolean[] vis = new boolean[n];

        for(int i=0; i<pre.length; i++){
            int a = pre[i][0];
            int b = pre[i][1];

            list.get(b).add(a);
            indegree[a]++;
        }

        Queue<Integer> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(indegree[i] == 0){
                q.add(i);
                vis[i] = true;
            }
        }

        while(!q.isEmpty()){
            int node = q.remove();
            ans.add(node);

            for(int ele : list.get(node)){
                indegree[ele]--;
                if(indegree[ele] == 0){
                  q.add(ele);
                  vis[ele] = true;
                }
            }
        }

        if(ans.size()==n) return true;
        else return false;
    }
}