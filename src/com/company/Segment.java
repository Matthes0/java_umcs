package com.company;

public class Segment {
    private Point a;
    private Point b;
    public Segment(Point a, Point b){
        this.a = a;
        this.b = b;
    }
    public Point getA() {
        return a;
    }

//    public void setA(Point a) {
//        this.a = a;
//    }

    public Point getB() {
        return b;
    }

//    public void setB(Point b) {
//        this.b = b;
//    }
    public double returnLen(Point a, Point b){
        return Math.sqrt((b.x-a.x)*(b.x-a.x)+(b.y-a.y)*(b.y-a.y));
    }
//    public String toSvg() {
//        return String.format(Locale.ENGLISH, "<line x1=\"%f\" y1=\"%f\" x2=\"%f\" y2=\"%f\" style=\"stroke:rgb(0,0,0);stroke-width:2\" />",a.x,a.y,b.x,b.y);
//    }
}
