/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appletdraw;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class mouse extends Applet implements MouseListener,MouseMotionListener{
String mag="";
public void init()
{
    addMouseListener(this);
    addMouseMotionListener(this);
    
}
public void paint (Graphics g)
{
    g.drawString(mag, 100, 120);
}
    @Override
    public void mouseClicked(MouseEvent e) {
        mag="mouse is clicked";
        repaint();
                
    }

    @Override
    public void mousePressed(MouseEvent e) {
        mag="mouse is pressed";
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        mag="mouse is released";
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        mag="mouse is entered";
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        mag="mouse is exited";
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        mag="mouse is dragged";
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        mag="mouse is moved";
        repaint();
    }

    
}