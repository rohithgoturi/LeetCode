class Solution {

    static class Triplet implements Comparable<Triplet> {
        int row;
        int col;
        int effort;

        Triplet(int row, int col, int effort) {
            this.row = row;
            this.col = col;
            this.effort = effort;
        }

        @Override
        public int compareTo(Triplet t) {
            return this.effort - t.effort;
        }
    }

    public int minimumEffortPath(int[][] heights) {

        int n = heights.length;
        int m = heights[0].length;

        int[][] dist = new int[n][m];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }

        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        dist[0][0] = 0;
        pq.add(new Triplet(0, 0, 0));

        while (!pq.isEmpty()) {

            Triplet current = pq.poll();

            int row = current.row;
            int col = current.col;
            int effort = current.effort;

            if (row == n - 1 && col == m - 1) {
                return effort;
            }

            if (row - 1 >= 0) {

                int newEffort = Math.max(
                    effort,
                    Math.abs(heights[row][col] - heights[row - 1][col])
                );

                if (newEffort < dist[row - 1][col]) {
                    dist[row - 1][col] = newEffort;
                    pq.offer(new Triplet(row - 1, col, newEffort));
                }
            }

            if (row + 1 < n) {

                int newEffort = Math.max(
                    effort,
                    Math.abs(heights[row][col] - heights[row + 1][col])
                );

                if (newEffort < dist[row + 1][col]) {
                    dist[row + 1][col] = newEffort;
                    pq.offer(new Triplet(row + 1, col, newEffort));
                }
            }

            if (col - 1 >= 0) {

                int newEffort = Math.max(
                    effort,
                    Math.abs(heights[row][col] - heights[row][col - 1])
                );

                if (newEffort < dist[row][col - 1]) {
                    dist[row][col - 1] = newEffort;
                    pq.offer(new Triplet(row, col - 1, newEffort));
                }
            }

            if (col + 1 < m) {

                int newEffort = Math.max(
                    effort,
                    Math.abs(heights[row][col] - heights[row][col + 1])
                );

                if (newEffort < dist[row][col + 1]) {
                    dist[row][col + 1] = newEffort;
                    pq.offer(new Triplet(row, col + 1, newEffort));
                }
            }
        }

        return 0;
    }
}