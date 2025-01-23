package DesignPattern.StrategyDesign;

public class Order
{

    public static void main(String[] args) throws IllegalAccessException
    {


        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.pay(new CreditCardPayment("john",123456789,123));

//        PaymentMode paymentMode = new PaymentMode();
//        paymentMode.setPaymentMode(new CreditCardPayment("john",123456789,123));
//        paymentMode.paymentProcessing(100.50);
//
//        paymentMode.setPaymentMode(new PaypalPayment("john","1234@Pay"));
//        paymentMode.paymentProcessing(120.50);
//
//        paymentMode.setPaymentMode(new GPayPayment("john@upi"));
//        paymentMode.paymentProcessing(150.50);

    }
}
