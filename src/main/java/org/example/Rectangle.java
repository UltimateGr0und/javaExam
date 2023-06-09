package org.example;

public class Rectangle {
    int width;
    int height;
    public void setWidth(Integer width){
        this.width = width;
    }
    public void setHeight(Integer height){
        this.height = height;
    }
    public int getWidth(){
        return this.width;
    }
    public int getHeight(){
        return this.height;
    }
    public int calculateArea(){
        return width*height;
    }
}
