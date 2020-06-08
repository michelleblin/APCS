public class Tester
{
  public static void main(String[] args)
  {
    Robot slop = new Sloppy();
    System.out.println(slop.clearHall());
    Robot hv = new HeavyDuty();
    System.out.println(hv.clearHall());

  }
}
