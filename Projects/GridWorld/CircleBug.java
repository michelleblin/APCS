import info.gridworld.actor.Bug; 
public class CircleBug extends Bug
{
    private int sideLength, steps;
    
    public CircleBug(int len)
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
            steps =0;
        }
    }
}
