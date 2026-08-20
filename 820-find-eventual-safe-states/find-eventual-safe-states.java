class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<List<Integer>> list = new ArrayList<>();
        int n = graph.length;

        for(int i=0; i<n; i++) {
            List<Integer> ans = new ArrayList<>();
            list.add(ans);
        }

        int[] indegree = new int[n];

        for(int i=0; i<n; i++){
            for(int ele: graph[i]){
                list.get(ele).add(i);
                indegree[i]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(indegree[i] == 0) q.add(i);
        }

        while(!q.isEmpty()){
            int node = q.remove();
            ans.add(node);

            for(int ele : list.get(node)){
                indegree[ele]--;

                if(indegree[ele] == 0) q.add(ele);
            }
        }

        Collections.sort(ans);

        return ans;
    }
}