

class Solution {
    public int orangesRotting(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        int freshCount = 0;

        // Step 1: Scan the grid
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                }

                if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }

        // Step 2: No fresh oranges
        if (freshCount == 0) {
            return 0;
        }

        int minutes = 0;

        // Directions: Up, Right, Down, Left
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        // Step 3: BFS
        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                int[] curr = queue.poll();
                int row = curr[0];
                int col = curr[1];

                for (int d = 0; d < 4; d++) {

                    int nr = row + dr[d];
                    int nc = col + dc[d];

                    // Check boundaries
                    if (nr >= 0 && nr < rows && nc >= 0 && nc < cols
                            && grid[nr][nc] == 1) {

                        // Mark rotten
                        grid[nr][nc] = 2;

                        // Add to queue
                        queue.offer(new int[]{nr, nc});

                        // One less fresh orange
                        freshCount--;
                    }
                }
            }

            // Increase minute only if another level exists
            if (!queue.isEmpty()) {
                minutes++;
            }
        }

        // Step 4: Check if all oranges became rotten
        if (freshCount == 0) {
            return minutes;
        }

        return -1;
    }
}
