import info.gridworld.actor.Bug; 

public class DancingBug extends Bug
{
    private int[] turns;
    private int index;
    
    public DancingBug(int[] t)
    {
        turns = t;
        index =0;
    }
    
    public void act()
    {
        for(int i=0; i<turns[index]; i++)
            turn();
        super.act();
        if(index==turns.length-1)
            index=0;
        else
            index++;
        
    }
}
