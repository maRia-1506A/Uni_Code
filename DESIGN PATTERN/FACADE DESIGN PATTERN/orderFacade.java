interface orderTask {
    public void execute(String productId, double amount);
}

class inventoryTask implements orderTask {
    public void execute(String productId, double amount) {
        System.out.println("Stock available: " + productId);
    }
}

class shippingTask implements orderTask {
    public void execute(String productId, double amount) {
        System.out.println("Shipping product: " + productId);
    }
}

class paymentTask implements orderTask {
    public void execute(String productId, double amount) {
        System.out.println("Payment processing: " + amount);
    }
}

public class orderFacade {
    private orderTask inventory;
    private orderTask shipping;
    private orderTask payment;

    public orderFacade() {
        this.inventory = new inventoryTask();
        this.shipping = new shippingTask();
        this.payment = new paymentTask();
    }

    public void placeOrder(String productId, double amount){
        inventory.execute(productId, amount);
        shipping.execute(productId, amount);
        payment.execute(productId, amount);
    }

    public static void main(String[] args) {
        orderFacade order= new orderFacade();
        order.placeOrder("101", 3400);
    }
}

