/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appletdraw;

import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author admin
 */
public class hut extends Applet{
    public void paint(Graphics g)
    {
       g.drawLine(15,60,70,30);
       g.drawLine(15, 60, 15, 120);
       g.drawLine(70, 30, 120, 60);
       g.drawLine(120, 60, 120, 120);
       g.drawLine(15, 120, 120, 120);
       g.drawLine(70, 30, 240, 30);
       g.drawLine(240, 30, 290, 60);
       g.drawLine(290, 60, 290, 90);
       g.drawLine(120, 120, 290, 90);
       g.drawLine(120, 60, 290, 60);
    }
}
