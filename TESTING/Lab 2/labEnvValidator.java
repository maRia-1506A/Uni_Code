/*a lab monitoring system record: (BVA)
    1. temparature(c): -10 to 50
    2. humidity(%): 0 to 100
validate inputs using binary value check, robustness, worst-case scenario*/

public class labEnvValidator {
    public static boolean temparature(int temp) {
        return (temp >= -10) && (temp <= 50);
    }

    public static boolean humidity(int humd) {
        return (humd >= -0) && (humd <= 100);
    }

    public static boolean finalCheck(int temp, int humd) {
        return (temparature(temp)) && (humidity(humd));
    }

    public static void main(String[] args) {
        // bvc
        System.out.println("Boundary Value Check (BVC)");
        System.out.println("Temperature: -10-> " + temparature(-10));
        System.out.println("Temperature: -9-> " + temparature(-9));
        System.out.println("Temperature: 50-> " + temparature(50));
        System.out.println("Temperature: 49-> " + temparature(49));

        System.out.println("Humidity: 0-> " + humidity(0));
        System.out.println("Humidity: 1-> " + humidity(1));
        System.out.println("Humidity: 99-> " + humidity(99));
        System.out.println("Humidity: 100-> " + humidity(100));

        // robust testing
        System.out.println("\nRobustness Testing");
        System.out.println("Temperature: -11-> " + temparature(-11));
        System.out.println("Temperature: 51-> " + temparature(51));

        System.out.println("Humidity: -1-> " + humidity(-1));
        System.out.println("Humidity: 101-> " + humidity(101));

        // worst case
        System.out.println("\nWorst Case Testing");
        int[] temp = { -10, -9, 49, 50 };
        int[] humd = { 0, 1, 99, 100 };

        for (int t : temp) {
            for (int h : humd) {
                System.out.println("Temperature: " + t + ", Humidity: " + h + " -> " + finalCheck(t, h));
            }
        }
    }
}
