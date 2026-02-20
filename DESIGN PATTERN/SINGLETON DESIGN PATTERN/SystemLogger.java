public class SystemLogger {
    // private object 
    private static SystemLogger instance; 
    
    // private constructor 
    private SystemLogger() {
        System.out.println("Login successfull");
    }

    // public method 
    public static SystemLogger methodLogger(){
        if(instance==null) {
            return new SystemLogger();
        }
        return instance;
    }

}
