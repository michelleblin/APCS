public class Vehicle extends TaxableItem
{
    private double dealerCost, dealerMarkup;

    public Vehicle(double rate, double cost, double markup)
    {
        super(rate);
        dealerCost=cost;
        dealerMarkup=markup;
    }

    public double getListPrice()
    {
        return dealerCost+dealerMarkup;
    }

    public void changeMarkUp(double markup)
    {
        dealerMarkup=markup;
    }
}