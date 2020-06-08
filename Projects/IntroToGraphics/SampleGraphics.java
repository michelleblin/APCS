import javax.swing.*;  // for JFrame
import java.awt.*;     // for Graphics and Container

public class SampleGraphics
{  
    public static void main (String[] args)
    {
        JFrame win;                 // JFrame Graphics setup
        Container contentPane;
        Graphics g;
      
        win = new JFrame("My First Graphics");  // window setup
        win.setSize(500,500);
        win.setLocation(100,100);
        win.setVisible(true);
      
        contentPane = win.getContentPane();   // activates graphics in window
        g = contentPane.getGraphics();
        win.setBackground(new Color(219, 247, 255));
      
        //  If you get a blank window, your computer's speed (lack thereof?)
        //  requires this delay in order to give the window time to appear
        //  before attempting to draw on it
        try {Thread.sleep(400);} catch (Exception e) {}
            
        g.setColor(Color.WHITE);
       
        //g.fillOval(220,90,50,50);  // the body
        g.fillOval(210,120,75,75);
        g.fillOval(187,175,120,120);
        
        g.setColor(Color.BLACK);    // the eyes
        g.fillOval(230,140,8,8);
        g.fillOval(250,140,8,8);
        
        g.fillOval(230,165,3,3);    // the mouth
        g.fillOval(237,170,3,3);
        g.fillOval(244,172,3,3);
        g.fillOval(251,170,3,3);    
        g.fillOval(258,165,3,3);
        
        g.fillOval(244,200,5,5);    // buttons
        g.fillOval(244,220,5,5);
        g.fillOval(244,240,5,5);
        g.fillOval(244,260,5,5);
        
        g.fillRect(220,120,55, 7);  // hat
        g.fillRect(227,90,40, 30);
        
        g.setColor(Color.ORANGE);   // nose
        g.fillOval(243,155, 7, 7); 
        
        g.setColor(Color.RED);
        g.fillRect(215, 180, 65, 10);

      
        // set color to any RGB value
        g.setColor(new Color(255,20,175));
       
        // draw a triangle
        //Polygon tri1 = new Polygon();
        //tri1.addPoint(200,100);
        //tri1.addPoint(250,150);
        //tri1.addPoint(180,180);
        //g.fillPolygon(tri1);       // drawPolygon() would create outline only
        
       

   }
}
