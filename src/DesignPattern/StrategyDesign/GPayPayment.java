package DesignPattern.StrategyDesign;

public class GPayPayment implements PaymentStrategy
{
    private String upi;

    public GPayPayment(String upi)
    {
        this.upi = upi;
    }

    @Override
    public void pay(double amount)
    {
        System.out.println("Paid $ "+amount+ " Using GPay UPI.");
    }
}
