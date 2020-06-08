import java.util.ArrayList;

import info.gridworld.actor.Critter;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class RockEater extends Critter
{

    public ArrayList<Location> getMoveLocations()
    {
        Grid<Actor> gr = getGrid();
        ArrayList<Location> occ = gr.getOccupiedLocations();
        for (int i=0; i<occ.size(); i++)
        {
            if(!(gr.get(occ.get(i)) instanceof Rock))
            {
                occ.remove(i);
                i--;
            }
        }
        return occ;
    }
}