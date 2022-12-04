class Solution {
     public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0) return 0;
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n ; j++){                
                if (grid[i][j] == '1') {
                    ans++;
                    removeIsland(grid, i, j);
                }
            }
        }
        return ans;
    }
    private void removeIsland(char[][] grid, int i, int j){
        if (grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        if (i - 1 >= 0) {
            removeIsland(grid, i - 1, j);
        }
        if (i + 1 < grid.length) {
            removeIsland(grid, i + 1, j);
        }
        if (j - 1 >= 0) {
            removeIsland(grid, i, j - 1);
        }
        if (j + 1 < grid[0].length) {
            removeIsland(grid, i, j + 1);
        }
    }

}