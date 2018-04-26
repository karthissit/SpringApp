package com.karthi.ShapeApp.Shape;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public interface Shape extends InitializingBean, DisposableBean{
    void draw();
}
