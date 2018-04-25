/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Graphics;
import model.Shape;
import java.util.ArrayList;
import model.AbstractShape;
import view.Canvas;
import static view.Canvas.setCanvas;

/**
 *
 * @author Miralalaa
 */
public class Parser implements DrawingEngine {
    
    private ArrayList<AbstractShape> sh = new ArrayList<AbstractShape>();
    private Originator Org = new Originator();
    private Caretaker care = new Caretaker();
    private int counter=0;
    private static Parser uniqueParser;
    
   public static Parser getInstance()
    {
        if(uniqueParser == null)
            uniqueParser = new Parser();
        return uniqueParser;
    }
    

    
    public Parser()
    {
        
    }
    
    
    
    @Override
    public void draw(Object canvas){
        Graphics g = (Graphics)canvas;
        for(Shape shape: sh){
           shape.draw(g); 
           
        }
        Org.setCan(Canvas.getInstance());
        care.addMemento(Org.createMemento());
        int x = getCounter();
        x++;
        setCounter(x);
        
    }

    public ArrayList<AbstractShape> getSh() {
        return sh;
    }
    
    
    public void addShape(Shape shape){

        
        sh.add((AbstractShape)shape);
    }
    
   
    public void removeShape(Shape shape){

        for(AbstractShape shapes: sh){
            if(shapes.equals((AbstractShape)shape))
                sh.remove(shape);
            
            
        }
        Org.setCan(Canvas.getInstance());
        care.addMemento(Org.createMemento());
        int x = getCounter();
        x++;
        setCounter(x);
    }
    
    
    public void updateShape(Shape oldShape, Shape newShape){
      for(Shape shapes: sh){
            if(shapes.equals(oldShape))
                sh.set(sh.indexOf(oldShape), (AbstractShape)newShape);}
        Org.setCan(Canvas.getInstance());
        care.addMemento(Org.createMemento());
        int x = getCounter();
        x++;
        setCounter(x);
    }
    
    
    
    @Override
    public Shape[] getShapes(){ 
        Shape[] shapes = new Shape[sh.size()];
        shapes= sh.toArray(shapes);
        return shapes;}
    
    
    public void undo() 
    {
        try{
        int x = getCounter();
        setCanvas(Org.returnMemento(care.getMemento(x)));
        x--;
        setCounter(x);
                }
        catch(IndexOutOfBoundsException e)
        {
            
        }
    }
    
    
    public void redo(){
    
            try{
        int x = getCounter();
        setCanvas(Org.returnMemento(care.getMemento(x)));
        x++;
        setCounter(x);
                }
        catch(IndexOutOfBoundsException e)
        {
            
        }
    
    }
    
    
    public void save(String path){}
    
    
    public void load(String path){}

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    
    
    }