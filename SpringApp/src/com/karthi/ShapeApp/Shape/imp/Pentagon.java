package com.karthi.ShapeApp.Shape.imp;

import com.karthi.ShapeApp.Shape.Shape;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.ArrayList;
import java.util.List;

public class Pentagon implements Shape {

    private List<Point> pointList = new ArrayList<Point>();
    private List<Line> lines = new ArrayList<Line>();

    public List<Point> getPointList() {
        return pointList;
    }

    public void setPointList(List<Point> pointList) {
        this.pointList = pointList;
    }

    public List<Line> getLines() {
        return lines;
    }

    public void setLines(List<Line> lines) {
        this.lines = lines;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Pentagon");
    }

    @Override
    public void destroy() throws Exception {
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
