public class Robot
{
  private int[] hall;
  private int pos;
  private boolean facingRight;

  public Robot()
  {
    hall = new int[]{1, 1, 2, 2};
    pos = 1;
    facingRight = true;
  }

  public int[] getHall()
  {
    return hall;
  }

  public void setHall(int[] tiles)
  {
    hall = tiles;
  }

  public int getPos()
  {
    return pos;
  }

  public void setPos(int position)
  {
    pos = position;
  }

  public boolean getDirection()
  {
    return facingRight;
  }

  public void setDirection(boolean getDirection)
  {
    facingRight = getDirection;
  }

  public boolean forwardMoveBlocked()
  {
    return (pos==hall.length-1 && facingRight) || (pos==0 && !facingRight);
  }

  public void move()
  {
    if(hall[pos] > 0)
      hall[pos]--;
    if(hall[pos] == 0)
      if(forwardMoveBlocked())
        facingRight = !facingRight;
      else if(facingRight)
        pos++;
      else
        pos--;
  }

  private boolean hallIsClear()
  {
    for(int i=0; i<hall.length; i++)
      if(hall[i] != 0)
        return false;
    return true;
  }

  public int clearHall()
  {
    int count = 0;
    while (!hallIsClear())
    {
      move();
      count++;
    }
    return count;
  }
}
