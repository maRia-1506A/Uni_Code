// interface (WHAT payment can do......)
interface paymentInterface{
    String pay (double amount);
}

// CreditCardPayment class (HOW payment works)
class CreditCardPayment implements paymentInterface {
    public String pay(double amount) {
        return "Paid by Card: "+amount;
    }
}

// PayPalPayment class (HOW payment works)
class PayPalPayment implements paymentInterface {
    public String pay(double amount) {
       return "Paid by Paypal: "+amount;
    }
}

// BankTransferPayment class (HOW payment works)
class BankTransferPayment implements paymentInterface{
    public String pay(double amount) {
       return "Paid by Bank Transfer: "+amount;
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

// client / main class 
public class MarketplaceClient {
    // Manage the Process & create object
    // like what type of payment method will choose & whats the amount for transiction
    public String pay(String type, double amount) {
        paymentInterface pm= PaymentFactory.create(type);
        return pm.pay(amount);
    }

    public static void main(String[] args) {
        MarketplaceClient m= new MarketplaceClient();

        System.out.println(m.pay("CreditCard", 10000));
        System.out.println(m.pay("Paypal", 5000));
    }
}