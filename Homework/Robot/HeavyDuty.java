public class HeavyDuty extends Robot
{
  public HeavyDuty()
  {
    super();
  }

  public void move()
  {
    if(getHall()[getPos()] > 1)
      getHall()[getPos()]-=2;
    else if(getHall()[getPos()] > 0)
      getHall()[getPos()]--;

    if(getHall()[getPos()]== 0)
      if(forwardMoveBlocked())
        setDirection(!getDirection());
      else if(getDirection())
        setPos(getPos()+1);
      else
        setPos(getPos()-1);
  }
}
