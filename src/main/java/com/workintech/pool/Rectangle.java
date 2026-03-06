package com.workintech.pool;

import java.util.Locale;

public class Rectangle {
    static {
        Locale.setDefault(Locale.US);
    }
    private double width,length;

    public Rectangle(double width , double length) {
        this.length = Math.max(length,0);
        this.width = Math.max(width,0);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public double getArea(){
        return  this.width*this.length;
    }
}
