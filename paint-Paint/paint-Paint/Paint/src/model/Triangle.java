/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Factory;
import controller.Parser;
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author MaramH
 */
public class Triangle extends AbstractShape {

    public Triangle() {
        properties = new HashMap<>();
        properties.put("x2", 0.0);
        properties.put("y2", 0.0);
        properties.put("x3", 0.0);
        properties.put("y3", 0.0);

    }

    public void draw(Object canvas) {
        Graphics g = (Graphics) canvas;
        ((Graphics2D) canvas).setColor(getFillColor());
        int[] xPoints = {position.x, (int) properties.get("x2").intValue(),
            (int) properties.get("x3").intValue()};

        int[] yPoints = {position.y, (int) properties.get("y2").intValue(),
            (int) properties.get("y3").intValue()};
        ((Graphics2D) canvas).fillPolygon(xPoints, yPoints, 3);
        ((Graphics2D) canvas).setStroke(new BasicStroke(2));
        ((Graphics2D) canvas).setColor(getColor());
        ((Graphics2D) canvas).drawPolygon(xPoints, yPoints, 3);

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Shape s = new Triangle();
        s.setColor(color);
        s.setFillColor(fillColor);
        s.setPosition(position);
        Map newP = new HashMap<>();
        for (Map.Entry k : properties.entrySet()) {
            newP.put(k.getKey(), k.getValue());
        }
        s.setProperties(newP);
        return s;

    }

    public AbstractShape resize(double x, double y) throws CloneNotSupportedException {
        Factory f = new Factory();

        Triangle newT = (Triangle) this.clone();

        f.factoryProp(newT, x, y);

        return newT;

    }

    public void move(Shape e, Point p) throws CloneNotSupportedException {
        Factory f = new Factory();
        int dx = p.x - e.getPosition().x;
        int dy = p.y - e.getPosition().y;
        Triangle newT = (Triangle) e.clone();
        newT.setPosition(p);
        f.factoryProp(newT, newT.getProperties().get("x2") + dx, newT.getProperties().get("y3") + dy);
        Parser.getInstance().updateShape(e, newT);
    }

    public void copy(Shape e, Point p) throws CloneNotSupportedException {
        Factory f = new Factory();
        int dx = p.x - e.getPosition().x;
        int dy = p.y - e.getPosition().y;
        Triangle newT = (Triangle) e.clone();
        //  Point p= new Point(newT.getPosition().x+10,newT.getPosition().y-10);
           newT.setPosition(p);
     

        f.factoryProp(newT, newT.getProperties().get("x2") + dx, newT.getProperties().get("y3") + dy);
           

        Parser.getInstance().addShape(newT);
    }

    public void delete(Shape e) {
        Parser.getInstance().removeShape(e);
    }

}
