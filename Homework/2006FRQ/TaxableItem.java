public abstract class TaxableItem implements Item
{
    private double taxRate;
    public TaxableItem(double rate)
    {
        taxRate=rate;
    }

    public abstract double getListPrice();

    public double purchasePrice()
    {
        return (1+taxRate) * getListPrice();
    }

}