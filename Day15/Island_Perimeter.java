//  463. Island Perimeter
//
//  https://leetcode.com/problems/island-perimeter/description

public class Island_Perimeter {
    public static int solve(int [][] grid, int i, int j) {
        int count = 0;
        if(j-1<0 || grid[i][j-1] == 0) count++;
        if(j+1>=grid[0].length || grid[i][j+1] == 0) count++;
        if(i-1<0 || grid[i-1][j] == 0) count++;
        if(i+1>=grid.length || grid[i+1][j] == 0) count++;

        return count;
    }
    public static int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans = 0;

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(grid[i][j] == 1) {
                    ans += solve(grid, i, j);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] mat = new int[][] {
                {0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}
        };
        int ans = islandPerimeter(mat);
        System.out.println(ans);
    }
}
