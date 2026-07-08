// Daraz payment system

interface PaymentGateway {
    void pay(double amount);
}

class BkashAPI {
    public void sendBkashPayment(double amount) {
        System.out.println("Payment of " + amount + " processed via bkash.");
    }
}

class NagadAPI {
    public void sendNagadPayment(double amount) {
        System.out.println("Payment of " + amount + " processed via Nagad.");
    }
}

class BkashAdapter implements PaymentGateway {
    private BkashAPI bkash;

    public BkashAdapter(BkashAPI bkash) {
        this.bkash = bkash;
    }

    public void pay(double amount) {
        bkash.sendBkashPayment(amount);
    }
}

class NagadAdapter implements PaymentGateway {
    private NagadAPI nagad;

    public NagadAdapter(NagadAPI nagad) {
        this.nagad = nagad;
    }

    public void pay(double amount) {
        nagad.sendNagadPayment(amount);
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        PaymentGateway bKashPayment = new BkashAdapter(new BkashAPI());
        PaymentGateway nagadPayment = new NagadAdapter(new NagadAPI());

        bKashPayment.pay(100);
        nagadPayment.pay(500);
    }
}
