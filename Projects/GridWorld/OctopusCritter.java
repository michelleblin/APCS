import info.gridworld.actor.Rock;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;
import java.util.ArrayList;

public class OctopusCritter extends Critter
{
    public void processActors(ArrayList<Actor> actors)
    {
        for (Actor a : actors)
        {
            if (a instanceof Rock)
            {
                int row = (int)(Math.random() * 8);
                int col = (int)(Math.random() * 9);
                a.setColor(Color.BLUE);
                a.moveTo(new Location(row, col));
                OctopusCritter newOC = new OctopusCritter();
                Location ocloc = new Location(row+1,col);
                newOC.putSelfInGrid(getGrid(),ocloc);
            }
            else
                a.removeSelfFromGrid();
        }
    }
}