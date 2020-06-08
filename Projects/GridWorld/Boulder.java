import info.gridworld.actor.Rock;
import info.gridworld.actor.Actor;
// import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.util.ArrayList;

public class Boulder extends Rock
{

    public ArrayList<Location> getMoveLocations()
    {
        if(getGrid().getOccupiedAdjacentLocations(getLocation()).size() != 0)
            return getGrid().getOccupiedAdjacentLocations(getLocation());
        return getGrid().getValidAdjacentLocations(getLocation());
    }
    /* 
    the boulder will continue to roll in a staight line(north, sout, east or west) 
    until it hits the edges or crushes another actor
    */
    public void roll(ArrayList<Location> moves)
    {
        Grid<Actor> gr = getGrid();
        Location loc = getLocation();
        int i = (int) (Math.random() * moves.size());
        
        setDirection(loc.getDirectionToward(moves.get(i)));
        Location next = loc.getAdjacentLocation(getDirection());
        while (gr.isValid(next) && !(gr.get(next) instanceof Boulder))
        {
            moveTo(next);
            // Boulder b = new Boulder();
            // b.putSelfInGrid(gr, loc);
            loc = getLocation();
            next = loc.getAdjacentLocation(getDirection());

            // Actor nextActor = gr.get(next);
            // if(gr.isValid(next) && gr.get(next) != null)
            // {
            //     moveTo(next);
            //     break;
            // }
        }
    }

    public void act()
    {
        roll(getMoveLocations());
    }
    
    // when the rock dies it will explode and kill everything in a 3 square radius
    public void removeSelfFromGrid()
    {
        Location loc = getLocation();
        for(int r = loc.getRow() - 2; r <= loc.getRow() + 2; r++ )
            for(int c = loc.getCol() - 2; c <= loc.getCol() + 2; c++)
            {
                Location tempLoc = new Location(r,c);
                if(getGrid().isValid(tempLoc))
                {
                    Actor a = getGrid().get(tempLoc);
                    if(a != null && a != this)
                        a.removeSelfFromGrid();
                
                }
            } 
        super.removeSelfFromGrid();
    }
}