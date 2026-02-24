class Logger {
    private static Logger instance;

    private Logger() {
        System.out.println("Logger activate");
    }

    public static Logger getinstance() {
        if(instance == null) {
            instance= new Logger();
        }
        return instance;
    }

    public void log(String msg) {
        System.out.println(msg);
    }
}
public class LoggerSystem {
    public static void main(String[] args) {
        Logger l1= Logger.getinstance();
        l1.log("1st msg");

        Logger l2= Logger.getinstance();
        l2.log("2nd msg");
        System.out.println(l1==l2);
    }
    
}
