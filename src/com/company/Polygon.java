package com.company;

import java.util.Locale;

public class Polygon {
    private Point[] vertices;
    Polygon(int num){
        vertices = new Point[num];
    }
    public void setVertex(int num, Point vertex){
        vertices[num] = vertex;
    }
    public void setVertices(Point[] vertices) {
        this.vertices = vertices;
    }
    public String toSvg(){
        String s = "";
        for(Point p: vertices){
            s = s+p.x+","+p.y+" ";
        };
        return String.format(Locale.ENGLISH, "<polygon points=\"%s\"/>",s);
    }
}
