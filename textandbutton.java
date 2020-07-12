/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appletdraw;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author admin
 */
public class textandbutton extends Applet implements ActionListener{

    TextField t1,t2,t3;
    Button b1,b2,b3;
    public void init()
    {
        t1=new TextField(12);
        t2 = new TextField(12);
        t3 = new TextField(12);
        b1=new Button("Sum");
        b2=new Button("pro");
        b3=new Button("diff");
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(t3);
        
        
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       int a,b,c=0;
       a=Integer.parseInt(t1.getText());
       b=Integer.parseInt(t2.getText());
       String s=e.getActionCommand();
       if (s.equals("Sum"))
       {
           c=a+b;
           
       }
       else if (s.equals("pro"))
       {
           c=a*b;
           
       }
       else 
       {
                c=a-b;
       }
    
    
t3.setText(s+"="+c);
   
    }
}
