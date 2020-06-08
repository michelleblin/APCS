import java.util.Scanner;

public class CountEmRight
{
  public static void main(String[] args) {
    Scanner kboard = new Scanner(System.in);
    String sentence = "";
    while(!sentence.equals("<<EXIT>>"))
    {
      System.out.print("Type in a sentence and press ENTER.  ");
      sentence = kboard.nextLine().toUpperCase();
      sentence = "<<" + sentence +">>";
      String[] sp = sentence.split("SA|S\\s+A");
      int occurrences = sp.length-1;
      if((!sentence.equals("<<EXIT>>")))
        System.out.println("There are " + occurrences + " occurrences.");
    }
  }
}
