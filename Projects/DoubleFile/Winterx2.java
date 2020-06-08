// this is a scale version of "Winter" by a factor of 150%
import javax.swing.*;
import java.awt.*;

public class Winterx2 extends JComponent {
    int[] xSnowPos;
    int[] ySnowPos;
    int[] snowSize;
    int[] xTree;
    int[] yTree;
    int[] treeSize;
    int treeColor;
    public Winterx2()
    {
        xSnowPos = new int[450];
        ySnowPos = new int[450];
        snowSize = new int[450];
        xTree = new int[60];
        yTree = new int[60];
        treeSize = new int[60];
        treeColor = 0;
        for(int i=0;  i<450; i++)
        {
            xSnowPos[i] = (int) (Math.random() *1050);
            ySnowPos[i] = (int) (Math.random() *750);
            snowSize[i] = (int) (Math.random() *7) +4;
        }
        for(int i=0; i<60; i++)
        {
            xTree[i] = (int) (Math.random() *1050);
            yTree[i] = (int) (Math.random() *75)+300;
            treeSize[i] = (int) (Math.random() * 75) +37;
        }
    }
    public void paint(Graphics g) {
        Graphics2D gd = (Graphics2D) g;
        
        gd.setColor(new Color(219, 247, 255));
        gd.fillRect(0,0, 1050, 1050);
        gd.setColor(new Color(250, 250, 250));
        gd.fillRect(0, 412, 1050, 450);
        
        
        for(int i=0; i<60; i++)
        {
            drawTree(g, xTree[i], yTree[i], treeSize[i]);
        }
        drawSnowman(gd, 675, 337);
        drawSnow(gd);
        try {Thread.sleep(30);} catch (Exception e) {}
        repaint();
    }
    
    
    
    public void drawTree(Graphics g, int x, int y, int size)
    {
        Color[] green = {new Color(51, 102, 0), new Color(78, 138, 80), new Color(7, 81, 5), new Color(26, 84, 8)};
        // draw a triangle
        treeColor++;
        if(treeColor >3)
            treeColor=0;
        
        g.setColor(green[treeColor]);
        Polygon tri = new Polygon();
        tri.addPoint(x+(int)(size/2),y);
        tri.addPoint(x+size,y+size*2);
        tri.addPoint(x,y+size*2);
        g.fillPolygon(tri);   
        g.setColor(new Color(107, 81, 4));
        g.fillRect(x+(int)(size*.4), y+size*2, (int) (size*.2), (int) (size*.6));
    }
    
    public  void drawSnowman(Graphics2D g, int x, int y)
    {
        // for shadow effect
        GradientPaint whiteToGray = new GradientPaint(x+25, y, Color.WHITE, x+300, y, Color.LIGHT_GRAY);    
        //g.setColor(Color.WHITE); 
        g.setPaint(whiteToGray);
        g.fillOval(x+34,y+45,112,112);  // the body
        g.fillOval(x,y+127,180,180);
        
        g.setColor(Color.BLACK);
        g.fillRect(x+60,y,60,45);       // hat
        g.fillRect(x+49,y+45,82,10); 
        
        g.fillOval(x+64,y+75,12,12);      // the eyes
        g.fillOval(x+94,y+75,12,12);
        
        g.fillOval(x+64,y+112,4,4);      // the mouth
        g.fillOval(x+75,y+120,4,4);
        g.fillOval(x+85,y+123,4,4);
        g.fillOval(x+96,y+120,4,4);    
        g.fillOval(x+106,y+112,4,4);
        
        g.fillOval(x+85,y+165,7,7);     // buttons
        g.fillOval(x+85,y+195,7,7);
        g.fillOval(x+85,y+225,7,7);
        g.fillOval(x+85,y+255,7,7);
        
        g.setColor(Color.ORANGE);       // nose
        g.fillOval(x+84,y+97, 10, 10); 
        
        g.setColor(Color.RED);          // scarf
        g.fillRect(x+42, y+135, 97, 15);
    }
    
    public  void drawSnow(Graphics g)
    {
        for(int i=0;  i<450; i++)
        {
            int x = xSnowPos[i];
            if(ySnowPos[i] > 750)
                ySnowPos[i] =0;
            
            int y = ySnowPos[i]++;
            g.setColor(Color.WHITE);
            g.fillOval(x, y, snowSize[i], snowSize[i]);
        }
        
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Winterx2");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Winterx2());
        frame.pack();
        frame.setSize(1050,750);
        frame.setVisible(true);
    }
}
