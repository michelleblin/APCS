import java.util.Scanner;
public class WeightOnPlanets
{
  public static void main(String[] args) {
    Scanner kboard = new Scanner(System.in);

    String[] planets = {"Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
    double[] gravity = {0.383, 0.949, 0.377, 2.36, 0.916, 0.889, 1.12, 0.071};
    for(int i = 1; i<planets.length+1; i++){
      System.out.println(i +".  " +planets[i-1]);
    }
    System.out.print("What is your weight on Earth?   ");
    int weight = kboard.nextInt();
    System.out.print("Select a planet   ");
    int choice = kboard.nextInt();
    System.out.println("Your weight on " + planets[choice-1]+ " is "+ (weight *gravity[choice-1]));
  }
}
