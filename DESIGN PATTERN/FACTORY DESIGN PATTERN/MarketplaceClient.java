// interface (WHAT payment can do)
interface paymentInterface{
    void pay (double amount);
}

// CreditCardPayment class (HOW payment works)
class CreditCardPayment implements paymentInterface {
    public void pay(double amount) {
        System.out.println("Paid by Card: "+amount);
    }
}

// PayPalPayment class (HOW payment works)
class PayPalPayment implements paymentInterface {
    public void pay(double amount) {
        System.out.println("Paid by Paypal: "+amount);
    }
}

// BankTransferPayment class (HOW payment works)
class BankTransferPayment implements paymentInterface{
    public void pay(double amount) {
        System.out.println("Paid by Bank Transfer: "+amount);
    }
}

// factory class (creates payment objects)
class PaymentFactory {
    public static paymentInterface create(String type) {
        switch(type) {
            case "CreditCard":
                return new CreditCardPayment();
            case "Paypal":
                return new PayPalPayment();
            case "BankTransfer":
                return new BankTransferPayment();
            default:
                return null;
        }
    }
}

