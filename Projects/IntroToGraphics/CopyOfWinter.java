import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class CopyOfWinter extends JComponent {
    int[] xSnowPos;
    int[] ySnowPos;
    public CopyOfWinter()
    {
        xSnowPos = new int[300];
        ySnowPos = new int[300];
        for(int i=0;  i<300; i++)
        {
            xSnowPos[i] = (int) (Math.random() *700);
            ySnowPos[i] = (int) (Math.random() *500);
        }
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        
        g2.setColor(new Color(219, 247, 255));
        g2.fillRect(0,0, 700, 700);
        g2.setColor(new Color(250, 250, 250));
        g2.fillRect(0, 275, 700, 300);
        
        
        drawTrees(g2, 30);
        //int x = (int) (Math.random() *450)+100;
        drawSnowman(g2, 450, 225);
        drawSnow(g2);
        try {Thread.sleep(100);} catch (Exception e) {}
        repaint();
    }
    
    public void drawTrees(Graphics g, int numTrees)
    {
        for(int i=0; i<numTrees/2*60; i+=60)
        {
            // int x = (int) (Math.random() *700);
            // int y = (int) (Math.random() *50)+200;
            // int size = (int) (Math.random() * 50) +25;
            drawTree(g, i, 200, 50);
        }
        
        for(int i=30; i<numTrees/2*60; i+=60)
        {
            // int x = (int) (Math.random() *700);
            // int y = (int) (Math.random() *50)+200;
            // int size = (int) (Math.random() * 50) +25;
            drawTree(g, i, 250, 50);
        }
        
    }
    
    public void drawTree(Graphics g, int x, int y, int size)
    {
        Color[] green = {new Color(78, 138, 80), new Color(7, 81, 5), new Color(26, 84, 8)};
        // draw a triangle
        int rand = (int) (Math.random() * 3);
        g.setColor(new Color(7, 81, 5));
        Polygon tri1 = new Polygon();
        tri1.addPoint(x+(int)(size/2),y);
        tri1.addPoint(x+size,y+size*2);
        tri1.addPoint(x,y+size*2);
        g.fillPolygon(tri1);   
        g.setColor(new Color(107, 81, 4));
        g.fillRect(x+(int)(size*.4), y+size*2, (int) (size*.2), (int) (size*.6));
    }
    
    public  void drawSnowman(Graphics2D g, int x, int y)
    {
        // for shadow effect
        GradientPaint whiteToGray = new GradientPaint(x+25, y, Color.WHITE, x+300, y, Color.LIGHT_GRAY);    
        //g.setColor(Color.WHITE); 
        g.setPaint(whiteToGray);
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
    
    public  void drawSnow(Graphics g)
    {
        for(int i=0;  i<300; i++)
        {
            int x = xSnowPos[i];
            if(ySnowPos[i] > 500)
                ySnowPos[i] =0;
            int y = ySnowPos[i]++;
            g.setColor(Color.WHITE);
            g.fillOval(x, y, 5, 5);
        }
        
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Gradient Paint Demo");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(new CopyOfWinter());
        frame.pack();
        frame.setSize(700,500);
        frame.setVisible(true);
    }
}
