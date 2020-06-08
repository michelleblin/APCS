public class LinearFunction implements LinearFunctionMethods
{
    private double b;
    private double slope;

    public LinearFunction(double m, double y)
    {
        b=y;
        slope = m;
    }

    public double getSlope()
    {
        return slope;
    }

    public double getYintercept()
    {
        return b;
    }

    public double getYvalue(double x)
    {
        return slope*x +b;
    }

    public double getXvalue(double y)
    {
        return (y-b)/slope;
    }

    public double getRoot()
    {
        return getXvalue(0);
    }


}