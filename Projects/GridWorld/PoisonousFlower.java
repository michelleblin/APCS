import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.*;
import info.gridworld.grid.Grid;

public class PoisonousFlower extends Flower
{
    private static final Color DEFAULT_COLOR = Color.BLUE;
    
    public PoisonousFlower()
    {
        setColor(DEFAULT_COLOR);
    }
    
    //removes all actors in all 8 adjacent locations
    public void act()
    {
        Grid<Actor> gr = getGrid();
        Location loc = getLocation();
        ArrayList<Actor> Occupied = gr.getNeighbors(loc);

        for (int i = 0; i < Occupied.size(); i++)
        {
            Occupied.get(i).removeSelfFromGrid();
        }
    }
}