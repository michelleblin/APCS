public class Sloppy extends Robot
{
  private int count;
  public Sloppy()
  {
    super();
    count=0;
  }
    
  public void move()
  {
    if(count >=3)
    {
      getHall()[getPos()]++;
      count=0;
    }
    else if(getHall()[getPos()] > 0)
    {
      getHall()[getPos()]--;
      count++;
    }
    if(getHall()[getPos()]== 0)
      if(forwardMoveBlocked())
        setDirection(!getDirection());
      else if(getDirection())
        setPos(getPos()+1);
      else
        setPos(getPos()-1);
  }
}