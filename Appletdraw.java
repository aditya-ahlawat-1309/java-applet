/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appletdraw;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author admin
 */
public class Appletdraw extends Applet{

    /**
     * @param args the command line arguments
     */
    
    public void paint(Graphics g)
    {
        g.drawString("i am aditya", 172, 56);
        g.drawString("applet drawing tool", 25, 16);
        g.drawRect(12, 13, 14, 15);
        g.drawOval(17, 18, 19, 20);
        g.fillRect(27, 19, 45, 44);
        Color c1=new Color(25,35,67);
        g.setColor(c1);
        g.fillRect(23, 120, 16, 37);
        
        
    }
            
   
            }
    

