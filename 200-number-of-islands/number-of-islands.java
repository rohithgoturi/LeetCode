class Solution {
    class Pair {
        int row;
        int col;

        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] vis = new boolean[n][m];

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1' && !vis[i][j]) {
                    count++;
                    bfs(i, j, grid, vis);
                }
            }
        }

        return count;
    }

    public void bfs(int i, int j, char[][] grid, boolean[][] vis) {
        int n = grid.length;
        int m = grid[0].length;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i, j));
        vis[i][j] = true;

        while (!q.isEmpty()) {
            Pair front = q.remove();
            int row = front.row;
            int col = front.col;

            if(row-1 >= 0){
                if(grid[row-1][col] == '1' && !vis[row-1][col]){
                    q.add(new Pair(row-1, col));
                    vis[row-1][col] = true;
                }
            }

            if((row+1) < n ){
                if(grid[row+1][col] == '1' && !vis[row+1][col]){
                    q.add(new Pair(row+1, col));
                    vis[row+1][col] = true;
                }
            }

            if(col-1 >= 0){
                if(grid[row][col-1] == '1' && !vis[row][col-1]){
                    q.add(new Pair(row, col-1));
                    vis[row][col-1] = true;
                }
            }

           if((col+1) < m){
                if(grid[row][col+1] == '1' && !vis[row][col+1]){
                    q.add(new Pair(row, col+1));
                    vis[row][col+1] = true;
                }
            }
        }
    }
}