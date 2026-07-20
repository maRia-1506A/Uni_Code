class ATMRequest {
    String cardNumber, pin;
    double balance;

    public ATMRequest(String cardNumber, String pin, double balance) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.balance = balance;
    }
}

interface ATMHandler {
    void setNext(ATMHandler nextHandler);

    void handle(ATMRequest request);
}

abstract class BaseHandler implements ATMHandler {
    protected ATMHandler next;

    @Override
    public void setNext(ATMHandler nextHandler) {
        this.next = nextHandler;
    }

    protected void forwardRequest(ATMRequest request) {
        if (next != null) {
            next.handle(request);
        } else {
            System.out.println("Authorization Passed. You may access your account.");
        }
    }
}

class CardValidationHandler extends BaseHandler {
    @Override
    public void handle(ATMRequest request) {
        if (request.cardNumber == null || !request.cardNumber.startsWith("4441")) {
            System.out.println("Invalid Card Number.");
        } else {
            System.out.println("Card Validated.");
            forwardRequest(request);
        }
    }
}

class PINValidationHandler extends BaseHandler {
    @Override
    public void handle(ATMRequest request) {
        if (request.pin.equals("1234")) {
            System.out.println("PIN Authentication successful.");
            forwardRequest(request);
        } else {
            System.out.println("PIN Verification failed.");
        }
    }
}

class BalanceWithdrawHandler extends BaseHandler {
    @Override
    public void handle(ATMRequest request) {
        if (request.balance > 500) {
            System.out.println("Insufficient Balance.");
        } else {
            System.out.println("Balance Verified.");
            forwardRequest(request);
        }
    }
}

public class ATMAuthorizationSystem {
    public static void main(String[] args) {
        ATMHandler card = new CardValidationHandler();
        ATMHandler pin = new PINValidationHandler();
        ATMHandler balance = new BalanceWithdrawHandler();

        card.setNext(pin);
        pin.setNext(balance);

        // Sample Client Request
        ATMRequest request = new ATMRequest("4441333322221111", "1234", 300.00);
        card.handle(request);
    }
}