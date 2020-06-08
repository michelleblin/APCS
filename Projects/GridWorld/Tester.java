import java.awt.Color;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.BoundedGrid;

public class Tester
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        // RockDropper rdc = new RockDropper(Color.PINK);
        // world.add(rdc);
        // world.add(new RockDropper(Color.ORANGE));
        // world.add(new RockDropper(Color.GREEN));



        // world.add(new Boulder());
        world.add(new BoxedInActor());
        world.add(new OctopusCritter());
        world.show();
    }
}
