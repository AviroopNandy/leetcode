public class Q695MaxAreaOfIsland {
  public int maxAreaOfIsland(int[][] grid) {
    int[][] fin = new int[grid.length][grid[0].length];
    int area=0,max=0;
    for(int i=0;i<grid.length;i++){
      for(int j=0;j<grid[0].length;j++){
        if(grid[i][j]==1){
          area = island(grid,fin,i,j);
          max=Math.max(area,max);
        }
      }
    }
    return max;
  }

  public int island(int[][] grid,int[][] fin, int sr, int sc){
    if(sr<grid.length && sr>=0 && sc<grid[0].length && sc>=0 && grid[sr][sc]==1 && fin[sr][sc]==0){
      fin[sr][sc]=1;
      return 1+island(grid,fin,sr+1,sc)+island(grid,fin,sr-1,sc)+island(grid,fin,sr,sc+1)+island(grid,fin,sr,sc-1);
    }
    else return 0;
  }
}
