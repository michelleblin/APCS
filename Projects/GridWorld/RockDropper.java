import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.awt.Color;

public class RockDropper extends Critter
{
    public RockDropper()
    {
        super();
    }
    public RockDropper(Color color)
    {
        super();
        setColor(color);
    }

    public void makeMove(Location newloc)
    {
        Location curr = getLocation();
        super.makeMove(newloc);
        if(!curr.equals(newloc))
        {
            Rock r = new Rock(getColor());
            r.putSelfInGrid(getGrid(), curr);
        }
    }
}