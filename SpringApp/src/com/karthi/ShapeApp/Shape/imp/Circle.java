package com.karthi.ShapeApp.Shape.imp;

import com.karthi.ShapeApp.Shape.Shape;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Circle implements Shape, ApplicationContextAware{

    private Point center;
    private int radius;
    private Line tangent;

    private ApplicationContext context = null;



    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Line getTangent() {
        return tangent;
    }

    public void setTangent(Line tangent) {
        this.tangent = tangent;
    }

    private void setAllData(){
        tangent = (Line) context.getBean("lineA");
        center = (Point) context.getBean("point_a");
    }

    @Override
    public void draw() {
        System.out.println("A Circle with radius " + radius + " and " + center + " as a centre with a tangent line starts from point "
            + tangent.getPointA() + " to " + tangent.getPointB()  + " is drawn");

        System.out.println("The Circumference of the circle is " + 2 * Math.PI * radius);
    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context = context;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Lemme try setting all data");
        setAllData();
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying Cirlce object");
    }
}
