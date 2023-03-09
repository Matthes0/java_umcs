package com.company;

public class Style {
    final public String fillColor;
    final public String strokeColor;
    final public double strokeWidth;

    Style(String fillColor, String strokeColor, double strokeWidth){
        if(fillColor == null){
            this.fillColor = "transparent";
        }else{
            this.fillColor = fillColor;
        }
    }

}
