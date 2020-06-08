public class Hanoi
{
    public static void main(String[] args) {
        towers(3, "A", "B", "C");
    }

    public static void towers(int n, String from, String spare, String to)
    {
        if(n==1)
        {
            System.out.println(from + " -->  " + to);
            return;
        }
        towers(n-1, from, to, spare);
        System.out.println(from + "  -->  "+ to);
        towers(n-1, spare, from, to);
    }
}