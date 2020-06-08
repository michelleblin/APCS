public class GettingLoopy
{
  public static void main(String[] args)
  {

    int count = 0;
    while(count <30000){
      System.out.print(" Michelle is cool ");
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) { }
      count++;
    }
  }
}
