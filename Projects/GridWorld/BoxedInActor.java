
/**
 * Write a description of class BattleCritter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import info.gridworld.actor.Rock;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import java.util.ArrayList;

public class BoxedInActor extends Actor
{
    public ArrayList<Location> getSurroundings()
    {
        return getGrid().getValidAdjacentLocations(getLocation());
    }
    
    public void shield(ArrayList<Location> locs)
    {
        for (Location l: locs)
        {
            Rock r = new Rock();
            r.putSelfInGrid(getGrid(), l);
        }
    }
    
    public void move()
    {
        Grid<Actor> gr = getGrid();
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (gr.isValid(next))
            moveTo(next);
        else
            setDirection(getDirection() + Location.RIGHT);;
    }
    
    public void act()
    {
        move();
        shield(getSurroundings());
    }
}