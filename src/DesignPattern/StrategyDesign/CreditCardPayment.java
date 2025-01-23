package DesignPattern.StrategyDesign;

public class CreditCardPayment implements PaymentStrategy
{
    private String name;
    private int cardNumber;
    private int cvv;

    public CreditCardPayment(String name, int cardNumber, int cvv)
    {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public void pay(double amount)
    {
        System.out.println("Paid $ "+amount+ " Using credit card");
    }
}