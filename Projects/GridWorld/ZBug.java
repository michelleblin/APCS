import info.gridworld.actor.Bug; 

public class ZBug extends Bug
{
    private int sideLength, steps, section;
    
    public ZBug(int len)
    {
        setDirection(90);
        sideLength = len;
    }
    
    public void act()
    {
        if(canMove() && sideLength>steps && section<3)
        {
            move();
            steps++;
        }
        else
        {
            section++;
            steps=0;
            if(section==1)
                setDirection(225);
            else
                setDirection(90);
        }
    }
}
