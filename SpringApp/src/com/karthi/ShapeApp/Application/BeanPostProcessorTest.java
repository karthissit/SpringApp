package com.karthi.ShapeApp.Application;

import com.karthi.ShapeApp.Shape.imp.Pentagon;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPostProcessorTest {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeanPostProcessorExample.xml");
        Pentagon pentagon = (Pentagon) context.getBean("pentagon");
        pentagon.draw();
    }
}
