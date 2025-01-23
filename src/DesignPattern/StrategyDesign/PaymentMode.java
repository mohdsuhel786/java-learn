package DesignPattern.StrategyDesign;

public class PaymentMode
{
    private PaymentStrategy paymentStrategy;

    public void setPaymentMode(PaymentStrategy payment){
        this.paymentStrategy = payment;
    }

    public void paymentProcessing(double amount) throws IllegalAccessException
    {
        if(paymentStrategy == null){
            throw new IllegalAccessException("Payment Mode is not proper set! ");
        }
        paymentStrategy.pay(amount);
    }
}
