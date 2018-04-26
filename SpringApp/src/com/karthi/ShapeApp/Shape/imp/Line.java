package com.karthi.ShapeApp.Shape.imp;

import com.karthi.ShapeApp.Shape.Shape;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/*
* Using Application Context aware, lets the bean know about the spring container and get the data dynamically from the Spring container
* BeanNameAware is similar to application context whereas the name of the current bean is directly provided by the Spring container
* */
public class Line implements Shape, ApplicationContextAware, BeanNameAware{

    private Point pointA;
    private Point pointB;
    private ApplicationContext applicationContext = null;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    @Override
    public void draw() {
        System.out.println("Line starts from point " + pointA + " to point " + pointB + " is drawn");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        System.out.println("The Id of the current context is: " + applicationContext.getDisplayName());
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name is: " + name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After initialization what should be done in line can be written here");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying Line object");
    }
}
