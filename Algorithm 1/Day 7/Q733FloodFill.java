public class Q733FloodFill {
  public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
    int oldColor = image[sr][sc];
    if(oldColor != newColor) {
      image=checks(image,sr,sc,oldColor,newColor);
    }
    return image;
  }

  public int[][] checks(int[][] image ,int sr, int sc, int oldColor, int newColor){
    if(sr<image.length && sr>=0 && sc<image[0].length && sc>=0 && image[sr][sc]==oldColor){
      image[sr][sc]=newColor;
    }
    else return image;

    checks(image,sr+1,sc,oldColor,newColor);
    checks(image,sr-1,sc,oldColor,newColor);
    checks(image,sr,sc+1,oldColor,newColor);
    checks(image,sr,sc-1,oldColor,newColor);
    
    return image;
  }
}
