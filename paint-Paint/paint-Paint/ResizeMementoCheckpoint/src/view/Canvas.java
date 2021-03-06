/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Actions;
import controller.Factory;
import controller.Parser;
import java.awt.Color;
import java.awt.*;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Scene;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout.Group;
import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.colorchooser.*;
import model.*;
import model.Shape;


/**
 *
 * @author MaramH
 */
public class Canvas extends javax.swing.JFrame {
    //private boolean 

    public static void setUniqueCanvas(Canvas aUniqueCanvas) {
        uniqueCanvas = aUniqueCanvas;
        
    }
    private String state = "Draw";
   
    private String s = "LineSegment";
    java.awt.Rectangle rect = new java.awt.Rectangle();

    /**
     * Creates new form Canvas
     */
    private static Canvas uniqueCanvas;

    private Factory f = new Factory();
    Parser p = Parser.getInstance();
    AbstractShape sh;
    public String getSelectedButtonText(ButtonGroup buttonGroup1) {
        for (Enumeration<AbstractButton> buttons = buttonGroup1.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getName();
            }
        }

        return null;
    }

    private Canvas() {
        initComponents();
        buttonGroup2.setSelected(jRadioButton3.getModel(), true);
        jRadioButton1.setSelected(true);

        buttonGroup1.setSelected(LineSegment.getModel(), true);
        resize.setEnabled(false);
        copy.setEnabled(false);
        move.setEnabled(false);
        delete.setEnabled(false);
        p.getCare().addMemento(p.getOrg().createMemento());
        
     

    }
        //
    public java.awt.Canvas getCanvas1() {
        return canvas1;
    }

    public void setCanvas1(java.awt.Canvas canvas1) {
        this.canvas1 = canvas1;
    }

    public static void setCanvas(Canvas can) {
        uniqueCanvas = can;
    }

    public static Canvas getInstance() {
        if (uniqueCanvas == null) {
            uniqueCanvas = new Canvas();
        }
        return uniqueCanvas;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Circle = new javax.swing.JToggleButton();
        Ellipse = new javax.swing.JToggleButton();
        Rectangle = new javax.swing.JToggleButton();
        Square = new javax.swing.JToggleButton();
        Triangle = new javax.swing.JToggleButton();
        LineSegment = new javax.swing.JToggleButton();
        jButton5 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        select = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        resize = new javax.swing.JToggleButton();
        copy = new javax.swing.JToggleButton();
        move = new javax.swing.JToggleButton();
        delete = new javax.swing.JToggleButton();
        canvas1 = new java.awt.Canvas();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Paint");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jLabel1.setText("Shapes");

        jLabel2.setText("Options");

        jLabel3.setText("Colors");

        buttonGroup1.add(Circle);
        Circle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CircleActionPerformed(evt);
            }
        });

        buttonGroup1.add(Ellipse);
        Ellipse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EllipseActionPerformed(evt);
            }
        });

        buttonGroup1.add(Rectangle);
        Rectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RectangleActionPerformed(evt);
            }
        });

        buttonGroup1.add(Square);
        Square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SquareActionPerformed(evt);
            }
        });

        buttonGroup1.add(Triangle);
        Triangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TriangleActionPerformed(evt);
            }
        });

        buttonGroup1.add(LineSegment);
        LineSegment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LineSegmentActionPerformed(evt);
            }
        });

        jButton5.setText("Choose Color");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jRadioButton1.setText("Line Color");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setText("Fill Color");

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("No Fill");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup3.add(select);
        select.setText("Select");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });

        jToggleButton2.setText("Undo");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton3.setText("Redo");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        buttonGroup3.add(resize);
        resize.setText("Resize");
        resize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resizeActionPerformed(evt);
            }
        });

        buttonGroup3.add(copy);
        copy.setText("Copy");
        copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyActionPerformed(evt);
            }
        });

        buttonGroup3.add(move);
        move.setText("Move");
        move.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveActionPerformed(evt);
            }
        });

        buttonGroup3.add(delete);
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(move, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(copy, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(jToggleButton2)
                        .addGap(27, 27, 27)
                        .addComponent(jToggleButton3)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(select)
                        .addGap(51, 51, 51)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Circle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Square, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(139, 139, 139))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Ellipse, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Triangle, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Rectangle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LineSegment, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addComponent(jRadioButton2)
                                .addGap(38, 38, 38))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton3)
                                .addGap(131, 131, 131))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addGap(109, 109, 109))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(select)
                                .addComponent(resize)
                                .addComponent(copy))
                            .addComponent(Rectangle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Circle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Ellipse, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jToggleButton2)
                                    .addComponent(jToggleButton3)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Triangle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LineSegment, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Square, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(move)
                                        .addComponent(delete)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );

        canvas1.setBackground(new java.awt.Color(255, 255, 255));
        canvas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                canvas1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                canvas1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                canvas1MouseReleased(evt);
            }
        });
        canvas1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                canvas1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                canvas1MouseMoved(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CircleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CircleActionPerformed
        s = "Circle";
    }//GEN-LAST:event_CircleActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Color c = JColorChooser.showDialog(null, "Choose a Color", jButton5.getForeground());
        if (jRadioButton1.isSelected()) {
            jRadioButton1.setBackground(c);
        }
        if (jRadioButton2.isSelected()) {
            jRadioButton2.setBackground(c);
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void canvas1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MousePressed

        //String s = getSelectedButtonText(buttonGroup1);
        //System.out.println("Maram");
        if(state.equals("Draw")){
        sh = (AbstractShape)f.factoryMethod(s);
        sh.setPosition(evt.getPoint());
        if (!jRadioButton3.isSelected()) {
            sh.setFillColor(jRadioButton2.getBackground());

        } else {
            sh.setFillColor(new Color(1f, 1f, 1f, .1f));
        }

        sh.setColor(jRadioButton1.getBackground());}
        else if (state.equals("Select")){
            rect.x = evt.getX();
            rect.y=evt.getY();
        }
        else{}
        


    }//GEN-LAST:event_canvas1MousePressed

    private void canvas1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MouseDragged
        if(state.equals("Draw")){
        f.factoryProp(sh, evt.getX(), evt.getY());

        sh.draw(canvas1.getGraphics());
        repaint();
        p.draw(canvas1.getGraphics());
        canvas1.getGraphics().clearRect(0, 0, canvas1.getWidth(), canvas1.getHeight());

        repaint();}
        else if(state.equals("Select") )
        {
            p.draw(canvas1.getGraphics());
            rect.width= evt.getX() - rect.x;
            rect.height=evt.getY() - rect.y;
            
            canvas1.getGraphics().drawRect(rect.x,rect.y,rect.width,rect.height);
            
            canvas1.getGraphics().clearRect(0,0,canvas1.getWidth(),canvas1.getHeight());
        }
        else if(state.equals("Resize"))
        {
         int x=0;
         
            try {for(int i=0;i<p.getSh().size();i++)
            {
                AbstractShape shape;
                if(p.getSh().get(i).isSelected())
                {   
                    shape=p.getSh().get(0);
                    p.getSh().set(0,p.getSh().get(i));
                    p.getSh().set(i, shape);
                System.out.println(i);
                        break;}}
                        System.out.println("resize drag");
                p.getSh().get(x).resize(p.getSh().get(x), evt.getX(), evt.getY());
                p.draw(canvas1.getGraphics());
                        canvas1.getGraphics().clearRect(0, 0, canvas1.getWidth(), canvas1.getHeight());
            } catch (CloneNotSupportedException | IndexOutOfBoundsException ex) {
                Logger.getLogger(Canvas.class.getName()).log(Level.SEVERE, null, ex);
            }
                         
                
                        
                
                    
        }
        else{}
       
       

    }//GEN-LAST:event_canvas1MouseDragged

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void canvas1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MouseReleased
        if(state.equals("Draw")){
        f.factoryProp(sh, evt.getX(), evt.getY());

        canvas1.getGraphics().clearRect(0, 0, canvas1.getWidth(), canvas1.getHeight());
        p.addShape(sh);
        p.draw(canvas1.getGraphics());

        repaint();}
        
        else if(state.equals("Select"))
        {  
            canvas1.getGraphics().fillRect(rect.x,rect.y,rect.width,rect.height);
            for(AbstractShape t: p.getSh())
            { 
                if(rect.contains(t.getPosition())){
                    t.setColor(Color.RED);
                    t.setSelected(true);
                break;}}
            p.draw(canvas1.getGraphics());
               resize.setEnabled(true);
               copy.setEnabled(true);
               move.setEnabled(true);
               delete.setEnabled(true);
               select.setSelected(false);
               state="Draw";
               
            
        }
        else if(state.equals("Resize"))
            {System.out.println("for rel");
                for(AbstractShape r:p.getSh())
            {
                if(r.isSelected())
                    try { System.out.println("resize rel");
                        r.resize(r, evt.getX(), evt.getY());
                        r.setColor(jRadioButton1.getBackground());
                        r.setSelected(false);
                        
                } catch (CloneNotSupportedException ex) {
                    Logger.getLogger(Canvas.class.getName()).log(Level.SEVERE, null, ex);
                }
            
                
            }
                canvas1.getGraphics().clearRect(0, 0, canvas1.getWidth(), canvas1.getHeight());
                 p.draw(canvas1.getGraphics());
                 state = "Draw";
        }
        else{}
    }//GEN-LAST:event_canvas1MouseReleased

    private void LineSegmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LineSegmentActionPerformed
        s = "LineSegment";
    }//GEN-LAST:event_LineSegmentActionPerformed

    private void SquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SquareActionPerformed
        s = "Square";
    }//GEN-LAST:event_SquareActionPerformed

    private void TriangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TriangleActionPerformed
        s = "Triangle";
    }//GEN-LAST:event_TriangleActionPerformed

    private void RectangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RectangleActionPerformed
        s = "Rectangle";
    }//GEN-LAST:event_RectangleActionPerformed

    private void EllipseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EllipseActionPerformed
        s = "Ellipse";
    }//GEN-LAST:event_EllipseActionPerformed

    private void canvas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MouseClicked
        // TODO add your handling code here:
         if(state.equals("Move")){
            try{
           for(AbstractShape r:p.getSh())
           {
               if(r.isSelected())
               {
                   r.move(r,evt.getPoint());
                   r.setColor(jRadioButton1.getBackground());
                   r.setSelected(false);
                   break;
               }
           }
           
            canvas1.getGraphics().clearRect(0, 0, canvas1.getWidth(), canvas1.getHeight());
             p.draw(canvas1.getGraphics());
             state = "Draw";
            }
            catch(IndexOutOfBoundsException | CloneNotSupportedException e)
        {}}
         
         else if(state.equals("Delete")){
            try{
           for(AbstractShape r:p.getSh())
           {
               if(r.isSelected())
               {
                   r.delete(r);
                   r.setColor(jRadioButton1.getBackground());
                   r.setSelected(false);
                   break;
               }
           }
           
            canvas1.getGraphics().clearRect(0, 0, canvas1.getWidth(), canvas1.getHeight());
             p.draw(canvas1.getGraphics());
             state = "Draw";
            }
            catch(IndexOutOfBoundsException e)
        {}}
       else if(state.equals("Copy")){
             System.out.println("Maram");
            try{
           for(AbstractShape r:p.getSh())
           {
               if(r.isSelected())
               {
                   System.out.println("hi");
                   
                   r.setColor(jRadioButton1.getBackground());
                   r.copy(r,evt.getPoint());
                   r.setSelected(false);
                   break;
               }
           }
           
            canvas1.getGraphics().clearRect(0, 0, canvas1.getWidth(), canvas1.getHeight());
             p.draw(canvas1.getGraphics());
             state = "Draw";
            }
            catch(IndexOutOfBoundsException | CloneNotSupportedException e)
        {}}
       else{}

    }//GEN-LAST:event_canvas1MouseClicked

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed

    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        if(state.equals("Select"))
            state="Draw";
        else
            state="Select";
        
    }//GEN-LAST:event_selectActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void canvas1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MouseMoved
        jTextField1.setText(evt.getPoint().toString());
    }//GEN-LAST:event_canvas1MouseMoved

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
      //System.out.println("undo");
        p.undo();
     canvas1.getGraphics().clearRect(0, 0, canvas1.getWidth(), canvas1.getHeight());
        p.draw(canvas1.getGraphics());
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
         p.redo();
        canvas1.getGraphics().clearRect(0, 0, canvas1.getWidth(), canvas1.getHeight());
       
        p.draw(canvas1.getGraphics());
        
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void resizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resizeActionPerformed
      state = "Resize";
    }//GEN-LAST:event_resizeActionPerformed

    private void copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyActionPerformed
        System.out.println("bye");
        state= "Copy";
    }//GEN-LAST:event_copyActionPerformed

    private void moveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveActionPerformed
        state = "Move";
    }//GEN-LAST:event_moveActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
       state = "Delete";
    }//GEN-LAST:event_deleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Canvas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Canvas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Canvas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Canvas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Canvas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Circle;
    private javax.swing.JToggleButton Ellipse;
    private javax.swing.JToggleButton LineSegment;
    private javax.swing.JToggleButton Rectangle;
    private javax.swing.JToggleButton Square;
    private javax.swing.JToggleButton Triangle;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private java.awt.Canvas canvas1;
    private javax.swing.JToggleButton copy;
    private javax.swing.JToggleButton delete;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton move;
    private javax.swing.JToggleButton resize;
    private javax.swing.JToggleButton select;
    // End of variables declaration//GEN-END:variables
}
