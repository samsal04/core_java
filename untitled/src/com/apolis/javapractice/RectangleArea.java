package com.apolis.javapractice;
//Given the coordinates of two rectilinear rectangles in a 2D plane, return the total area covered by the two rectangles.
//
//        The first rectangle is defined by its bottom-left corner (ax1, ay1) and its top-right corner (ax2, ay2).
//
//        The second rectangle is defined by its bottom-left corner (bx1, by1) and its top-right corner (bx2, by2).


public class RectangleArea {
    public static int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {

        int r1Length= Math.abs(ax2-ax1);
        System.out.println(r1Length);
        int r1Breadth= Math.abs(ay2-ay1);
        System.out.println(r1Breadth);
        int r2Length= Math.abs(bx2-bx1);
        System.out.println(r2Length);
        int r2Breadth= Math.abs(by2-by1);
        System.out.println(r2Breadth);



        int overlapLength= Math.abs(r1Length-r2Length);
        System.out.println(overlapLength);
        int overlapBreadth=Math.abs(r1Breadth-r2Breadth);
        System.out.println(overlapBreadth);


        int areaR1= Math.abs(r1Breadth*r1Length);
        System.out.println(areaR1);
        int areaR2= Math.abs(r2Breadth*r2Length);
        System.out.println(areaR2);
        int overlap=Math.abs(overlapBreadth*overlapLength);
        System.out.println(overlap);
        int total= areaR1+areaR2-overlap;
        System.out.println(total);

//        if (){
//
//        }

        return total;
    }

    public static void main(String[] args) {
        int ax1 = -3;
        int ay1 = 0;
        int ax2 = 3;
        int ay2 = 4;
        int bx1 = 0;
        int by1 = -1;
        int bx2 = 9;
        int by2 = 2;

        System.out.println(computeArea(ax1,ay1,ax2,ay2,bx1,by1,bx2,by2));

    }


}
