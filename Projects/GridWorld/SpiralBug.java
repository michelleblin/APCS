import info.gridworld.actor.Bug; 

public class SpiralBug extends Bug
{
    private int sideLength, steps;
    
    public SpiralBug(int len)
    {
        sideLength = len;
    }
    
    public void act()
    {
        if(canMove() && sideLength>steps)
        {
            move();
            steps++;
        }
        else
        {
            turn();
            turn();
            steps =0;
            sideLength++;
        }
    }
}
