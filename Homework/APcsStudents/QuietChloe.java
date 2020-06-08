public class QuietChloe extends APcsStudent
{
  private String name;
  public QuietChloe(String n, String ln, String s, String ChineseName)
  {
    super(n, ln, s);
    name = ChineseName;
  }

  public void speak()
  {
    System.out.println(getSaying()+" - " +super.name+" " + getLastName()+" ("+ getLastName()+name+")");
  }
}
