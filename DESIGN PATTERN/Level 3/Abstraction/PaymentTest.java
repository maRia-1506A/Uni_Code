/**Create an abstract class Payment and subclasses CreditCardPayment and
PayPalPayment implementing processPayment().**/

abstract class Payment {
    abstract void processPayment();
}
class CreditCardPayment extends Payment{
    @Override
    void processPayment() {
        System.out.println("Paid by Credit Card");
    }

}
class PayPalPayment extends Payment{
    @Override
    void processPayment() {
        System.out.println("Paid by PayPal");
    }
}

public class PaymentTest{
    public static void main(String[] args) {
        Payment p= new PayPalPayment();
        Payment c= new CreditCardPayment();

        p.processPayment();
        c.processPayment();
    }
}