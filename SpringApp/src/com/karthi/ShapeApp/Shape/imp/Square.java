package com.karthi.ShapeApp.Shape.imp;

import com.karthi.ShapeApp.Shape.Shape;

import java.util.ArrayList;
import java.util.List;

public class Square implements Shape{
    private Line line1;
    private Line line3;
    private Line line2;
    private Line line4;

    private List<Line> lineList = new ArrayList<>();

    public Line getLine1() {
        return line1;
    }

    public void setLine1(Line line1) {
        this.line1 = line1;
    }

    public Line getLine3() {
        return line3;
    }

    public void setLine3(Line line3) {
        this.line3 = line3;
    }

    public Line getLine2() {
        return line2;
    }

    public void setLine2(Line line2) {
        this.line2 = line2;
    }

    public Line getLine4() {
        return line4;
    }

    public void setLine4(Line line4) {
        this.line4 = line4;
    }

    private void makeList(){
        lineList.add(line1);
        lineList.add(line2);
        lineList.add(line3);
        lineList.add(line4);
    }

    @Override
    public void draw() {
        makeList();
        for(Line line: lineList){
            System.out.println("Line starts from point " + line.getPointA() + " to point " + line.getPointB() + " is drawn");
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After initialization what should be done in square can be written here");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying Square object");
    }
}
