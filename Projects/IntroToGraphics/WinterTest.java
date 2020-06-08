import javax.swing.*;  // for JFrame
import java.awt.*;   
public class WinterTest
{
    public static void main (String[] args)
    {
        JFrame win;                 // JFrame Graphics setup
        Container contentPane;
        Graphics g;
      
        win = new JFrame("My First Graphics");  // window setup
        win.setSize(700,500);
        win.setLocation(100,100);
        win.setVisible(true);
      
        contentPane = win.getContentPane();   // activates graphics in window
        g = contentPane.getGraphics();
        
        try {Thread.sleep(400);} catch (Exception e) {}
        g.setColor(new Color(219, 247, 255));
        g.fillRect(0,0, 700, 700);
        g.setColor(new Color(250, 250, 250));
        g.fillRect(0, 275, 700, 300);
        
        
        for(int i=0; i<30; i++)
        {
            int x = (int) (Math.random() *700);
            int y = (int) (Math.random() *50)+200;
            int size = (int) (Math.random() * 50) +25;
            drawTree(g, x, y, size);
        }
        int x = (int) (Math.random() *450)+100;
        drawSnowman(g, x, 225);
        drawSnow(g);
    }
    
    // size is the width of the tree and height will adjust
    public static void drawTree(Graphics g, int x, int y, int size)
    {
        Color[] green = {new Color(78, 138, 80), new Color(7, 81, 5), new Color(26, 84, 8)};
        // draw a triangle
        int rand = (int) (Math.random() * 3);
        g.setColor(green[rand]);
        Polygon tri1 = new Polygon();
        tri1.addPoint(x+(int)(size/2),y);
        tri1.addPoint(x+size,y+size*2);
        tri1.addPoint(x,y+size*2);
        g.fillPolygon(tri1);   
        g.setColor(new Color(107, 81, 4));
        g.fillRect(x+(int)(size*.4), y+size*2, (int) (size*.2), (int) (size*.6));
    }
    
    public static void drawSnowman(Graphics g, int x, int y)
    {
        // y=90 , x = 187
        
        g.setColor(Color.WHITE); 
        g.fillOval(x+23,y+30,75,75);  // the body
        g.fillOval(x,y+85,120,120);
        
        g.setColor(Color.BLACK);
        g.fillRect(x+40,y,40,30);       // hat
        g.fillRect(x+33,y+30,55,7); 
        
        g.fillOval(x+43,y+50,8,8);      // the eyes
        g.fillOval(x+63,y+50,8,8);
        
        g.fillOval(x+43,y+75,3,3);      // the mouth
        g.fillOval(x+50,y+80,3,3);
        g.fillOval(x+57,y+82,3,3);
        g.fillOval(x+64,y+80,3,3);    
        g.fillOval(x+71,y+75,3,3);
        
        g.fillOval(x+57,y+110,5,5);    // buttons
        g.fillOval(x+57,y+130,5,5);
        g.fillOval(x+57,y+150,5,5);
        g.fillOval(x+57,y+170,5,5);
        
        g.setColor(Color.ORANGE);       // nose
        g.fillOval(x+56,y+65, 7, 7); 
        
        g.setColor(Color.RED);          // scarf
        g.fillRect(x+28, y+90, 65, 10);
    }
    
    public static void drawSnow(Graphics g)
    {
        for(int i=0;  i<300; i++)
        {
            int x = (int) (Math.random() *700);
            int y = (int) (Math.random() *700);
            int size = (int) (Math.random() *5)+5;
            g.setColor(Color.WHITE);
            g.fillOval(x, y, 5, 5);
        }
    }
}
