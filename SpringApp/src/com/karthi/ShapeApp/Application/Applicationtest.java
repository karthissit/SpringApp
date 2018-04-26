package com.karthi.ShapeApp.Application;

import com.karthi.ShapeApp.Shape.imp.Circle;
import com.karthi.ShapeApp.Shape.imp.Line;
import com.karthi.ShapeApp.Shape.imp.Square;
import com.karthi.ShapeApp.Shape.imp.Triangle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Applicationtest {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        context.registerShutdownHook();

        System.out.println("\nDrawing Triangle");
        Triangle triangle = (Triangle) context.getBean("Triangle");
        triangle.draw();
        System.out.println("Drawn Triangle\n");

        System.out.println("Drawing Line");
        Line line = (Line) context.getBean("straightline");
        line.draw();
        System.out.println("Drawn Line\n");

        System.out.println("Drawing Square");
        Square square = (Square) context.getBean("square");
        square.draw();
        System.out.println("Drawn Square\n");


        System.out.println("Drawing ChildLine1");
        Line line1 = (Line) context.getBean("childline1");
        line1.draw();
        System.out.println("Drawn Childline1\n");

        System.out.println("Drawing Childeline2");
        Line line2 = (Line) context.getBean("childline2");
        line2.draw();
        System.out.println("Drawn Childline2\n");


        System.out.println("Drawing Circle");
        Circle circle = (Circle) context.getBean("testCircle");
        circle.draw();
        System.out.println("Drawn Circle \n");
    }
}
