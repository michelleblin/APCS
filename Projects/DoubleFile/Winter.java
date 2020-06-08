import javax.swing.*;
import java.awt.*;

public class Winter extends JComponent {
    int[] xSnowPos;
    int[] ySnowPos;
    int[] snowSize;
    int[] xTree;
    int[] yTree;
    int[] treeSize;
    int treeColor;
    public Winter()
    {
        xSnowPos = new int[300];
        ySnowPos = new int[300];
        snowSize = new int[300];
        xTree = new int[40];
        yTree = new int[40];
        treeSize = new int[40];
        treeColor = 0;
        for(int i=0;  i<300; i++)
        {
            xSnowPos[i] = (int) (Math.random() *700);
            ySnowPos[i] = (int) (Math.random() *500);
            snowSize[i] = (int) (Math.random() *5) +3;
        }
        for(int i=0; i<40; i++)
        {
            xTree[i] = (int) (Math.random() *700);
            yTree[i] = (int) (Math.random() *50)+200;
            treeSize[i] = (int) (Math.random() * 50) +25;
        }
    }
    public void paint(Graphics g) {
        Graphics2D gd = (Graphics2D) g;
        
        gd.setColor(new Color(219, 247, 255));
        gd.fillRect(0,0, 700, 700);
        gd.setColor(new Color(250, 250, 250));
        gd.fillRect(0, 275, 700, 300);
        
        
        for(int i=0; i<40; i++)
        {
            drawTree(g, xTree[i], yTree[i], treeSize[i]);
        }
        drawSnowman(gd, 450, 225);
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
        
        g.fillOval(x+57,y+110,5,5);     // buttons
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
            g.fillOval(x, y, snowSize[i], snowSize[i]);
        }
        
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Winter");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Winter());
        frame.pack();
        frame.setSize(700,500);
        frame.setVisible(true);
    }
}