package com.apolis.multidimensional;
//An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.
//You are also given three integers sr, sc, and color.
//You should perform a flood fill on the image starting from the pixel image[sr][sc].
//To perform a flood fill, consider the starting pixel,
//plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel,
//plus any pixels connected 4-directionally to those pixels (also with the same color), and so on.
//Replace the color of all the aforementioned pixels with color.
//Return the modified image after performing the flood fill.
//
//        Input: image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, color = 2
//        Output: [[2,2,2],[2,2,0],[2,0,1]]
//        Explanation: From the center of the image with position (sr, sc) = (1, 1) (i.e., the red pixel),
//        all pixels connected by a path of the same color as the starting pixel (i.e., the blue pixels)
//        are colored with the new color.Note the bottom corner is not colored 2,
//        because it is not 4-directionally connected to the starting pixel.
//
//        Example 2:
//        Input: image = [[0,0,0],[0,0,0]], sr = 0, sc = 0, color = 0
//        Output: [[0,0,0],[0,0,0]]
//        Explanation: The starting pixel is already colored 0, so no changes are made to the image.

public class FloodFill733 {

    private static int[][] floodFill(int[][] image, int sr, int sc, int color){

        if(image[sr][sc] != image[sr][sc]){
            return image;
        }
        floodFillIt(image,sr,sc,color,image[sr][sc]);

        return image;
    }
    private static void floodFillIt(int[][] image, int sr, int sc, int color,int trackColor) {

//            int rightLimit=image[0].length;
//            int leftLimit=0;
//            int topLimit=0;
//            int bottomLimit=image.length;
//
//            while(image[sr+1][sc]==color && image[sr][sc+1]==color &&
//                    image[sr-1][sc]==color &&image[sr][sc-1]==color){
//
//                // check right
//                if(image[sr+1][sc]==image[sr][sc] && sr+1<rightLimit){
//                    image[sr+1][sc]=color;
//                    sr=sr+1;
//                }
//                //check left
//                else if(image[sr-1][sc]==image[sr][sc] && sr-1>leftLimit){
//                    image[sr-1][sc]=color;
//                    sr=sr-1;
//                }
//                //check top
//                else if(image[sr][sc-1]==image[sr][sc] && sc-1>topLimit){
//                    image[sr][sc-1]=color;
//                    sc=sc-1;
//                }
//                //check bottom
//                else if(image[sr][sc+1]==image[sr][sc] && sc+1<bottomLimit){
//                    image[sr][sc+1]=color;
//                    sc=sc+1;
//                }
//
//            }
//
//
//
//            return image;

        if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length)return ;

        if(trackColor != image[sr][sc]) return;

        image[sr][sc]=color;

        floodFillIt(image,sr-1,sc,color,trackColor);
        floodFillIt(image,sr+1,sc,color,trackColor);
        floodFillIt(image,sr,sc-1,color,trackColor);
        floodFillIt(image,sr,sc+1,color,trackColor);
    }



    public static void main(String[] args) {
        int[][] image={{1,1,1},{1,1,0},{1,0,1}};
        int sr=1;
        int sc=1;
        int color=2;

        System.out.println(floodFill(image,sr,sc,color));
    }
}
