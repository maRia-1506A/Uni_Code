// facade

interface OrderProcessor {
    public void executeOrder(String OrderID, String ProductID);
}

class NotifySystem {
    public void notifyKitchen(String OrderID) {
        System.out.println("Kitchen is notified for order " + OrderID);
    }
}

class CheckInventory {
    public void check(String ProductID) {
        System.out.println("Inventory checked for product id " + ProductID);
    }
}

class orderFacade implements OrderProcessor {
    public NotifySystem notification;
    public CheckInventory inventory;

    public orderFacade() {
        this.notification = new NotifySystem();
        this.inventory = new CheckInventory();
    }

    public void executeOrder(String OrderID, String ProductID) {
        notification.notifyKitchen(OrderID);
        inventory.check(ProductID);
    }
}

public class DineNow {
    public static void main(String[] args) {
        orderFacade order = new orderFacade();
        order.executeOrder("order1", "product1");

    }

}