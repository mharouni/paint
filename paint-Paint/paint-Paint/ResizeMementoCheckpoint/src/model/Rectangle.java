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
public class Rectangle extends AbstractShape{
    
  
    public Rectangle()
    {
        properties=new HashMap<>();
        properties.put("width",0.0);
        properties.put("height",0.0);
    }
    
    public void draw(Object canvas)
    {
        ((Graphics2D)canvas).setColor(getFillColor());
        ((Graphics2D)canvas).fillRect((int)position.x,(int)position.y,(int)properties.get("width").intValue(),(int)properties.get("height").intValue());
        ((Graphics2D)canvas).setStroke(new BasicStroke(2));
        ((Graphics2D)canvas).setColor(getColor());
        ((Graphics2D)canvas).drawRect((int)position.x,(int)position.y,(int)properties.get("width").intValue(),(int)properties.get("height").intValue());
        
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException{
        Shape s=new Rectangle();
        s.setColor(color);
        s.setFillColor(fillColor);
        s.setPosition(position);
        Map newP = new HashMap<>();
        for(Map.Entry k: properties.entrySet())
            newP.put(k.getKey(),k.getValue());
        s.setProperties(newP);
        return s;
        
    }

   // @Override
    public boolean Contains(Point p) {
        double i = properties.get("width");
        double j = properties.get("height");
        if (position.x > p.x && position.y >p.y) {
            if (((double) position.x - p.x <= i) && ((double) position.y - p.y<= i))
                return true;
            else return false;
        }
        else if (position.x < p.x && position.y > p.y)
        {
            if (((double) p.x - position.x <= i) && ((double) position.y - p.y<= i))
                return true;
            else return false;
        }
        else if (position.x > p.x && position.y < p.y)
        {
            if (((double) position.x - p.x <= i) && ((double) p.y - position.y<= i))
                return true;
            else return false;
        }
        else if (position.x < p.x && position.y < p.y)
        {
            if (((double) p.x - position.x <= i) && ((double) p.y - position.y<= i))
                return true;
            else return false;
        }
        else if (position.x == p.x && position.y < p.y)
        {
            if (p.y - position.y <= i)
                return  true;
            else return false;
        }
        else if (position.x == p.x && position.y > p.y) {
            if (position.y - p.y <= i)
                return true;
            else return false;
        }
        else if (position.y == p.y && position.x < p.x)
        {
            if (p.x - position.x <= i)
                return  true;
            else return false;
        }
        else if (position.y == p.y && position.x > p.x) {
            if (position.x - p.x <= i)
                return true;
            else return false;
        }

        else return false;
    }
    
    public void resize(Shape e, double x, double y) throws CloneNotSupportedException
    {
        Factory f = new Factory();
        
        Rectangle newR = (Rectangle)e.clone();
        
        f.factoryProp(newR, x, y);
        
        Parser.getInstance().updateShape(e, newR);
    }
    public void move(Shape e, Point p) throws CloneNotSupportedException
    {
        Rectangle newT= (Rectangle)e.clone();
        newT.setPosition(p);
        Parser.getInstance().updateShape(e, newT);
    }
    
    public void copy(Shape e,Point p ) throws CloneNotSupportedException
    {
        Rectangle newT = (Rectangle)e.clone();
       // Point p= new Point(newT.getPosition().x+10,newT.getPosition().y-10);
              newT.setPosition(p);

        Parser.getInstance().addShape(newT);
    }
    
    public void delete(Shape e)
    {
        Parser.getInstance().removeShape(e);
    }
    }

