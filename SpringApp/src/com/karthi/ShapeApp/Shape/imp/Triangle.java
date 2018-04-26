package com.karthi.ShapeApp.Shape.imp;

import com.karthi.ShapeApp.Shape.Shape;

import java.util.List;

public class Triangle implements Shape {

    private String type;
    private int height;

    private List<Line> lines;

    public List<Line> getLines() {
        return lines;
    }

    public void setLines(List<Line> lines) {
        this.lines = lines;
    }

    public Triangle(String type){
        this.type = type;
    }

    public Triangle(int height) {
        this.height = height;
    }

    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Triangle of Type: " + this.getType() + " with height: " + this.getHeight());

        for(Line line: lines){
            System.out.println("Line starts from point " + line.getPointA() + " to point " + line.getPointB() + " is drawn");
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After initialization what should be done in triangle can be written here");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying Triange object");
    }
}
