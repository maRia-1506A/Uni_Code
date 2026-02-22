class DBconnection {
    private static DBconnection instance;

    private DBconnection() {
        System.out.println("Database is connected");
    }

    public static DBconnection getInstance() {
        if (instance == null) {
            instance = new DBconnection();
        }
        return instance;
    }

    public void logger(String msg) {
        System.out.println(msg);
    }
}

class TransactionModule {
    public void processTransiction() {
        DBconnection tr = DBconnection.getInstance();
        tr.logger("Transaction is completed!!");
    }
}

class AccountModule {
    public void manageAccount() {
        DBconnection acc = DBconnection.getInstance();
        acc.logger("Account is created");
    }
}

public class DBconnectionManager {
    public static void main(String[] args) {
        TransactionModule obj1 = new TransactionModule();
        obj1.processTransiction();
        AccountModule obj2 = new AccountModule();
        obj2.manageAccount();

        DBconnection user1 = DBconnection.getInstance();
        DBconnection user2 = DBconnection.getInstance();

        System.out.println(user1 == user2);
    }

}
