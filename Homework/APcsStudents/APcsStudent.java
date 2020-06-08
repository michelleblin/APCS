public class APcsStudent
{
  public String name;
  private String lastName;
  private String saying;

  public APcsStudent(String n, String ln, String s)
  {
    name = n;
    lastName = ln;
    saying = s;
  }

  public void speak()
  {
    System.out.println(saying+" - "+name+" "+lastName);
  }

  public String getName()
  {
    return name;
  }

  public String getLastName()
  {
    return lastName;
  }

  public String getSaying()
  {
    return saying;
  }
}
