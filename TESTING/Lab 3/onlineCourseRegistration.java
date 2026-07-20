/*Online Course Registration System (Equivalence Partitioning)
Requirements:
1. Age must be between 18 and 60 → Valid & Invalid Partitions
2. Password must be 6–12 characters → Open & Closed Intervals
3. Course Type must be one of: "Java", "Python", "C++" → Discrete Partitions
4. Scholarship Applied → Boolean (Yes/No)*/

public class onlineCourseRegistration {
    // valid & invalid partition
    public static boolean validAge(int age) {
        return age >= 18 && age <= 60;
    }

    // Open & Closed Intervals
    public static boolean validPassClosed(String password) {
        return password.length() >= 6 && password.length() <= 12;
    }

    public static boolean validPassOpen(String password) {
        return password.length() > 6 && password.length() < 12;
    }

    // Discrete Partitions
    public static boolean validCourse(String course) {
        switch (course) {
            case "Java":
            case "Python":
            case "C++":
                return true;
            default:
                return false;
        }
    }

    // Boolean (Yes/No)
    public static String approvedScholership(boolean scholership) {
        if (scholership) {
            return "Scholership Granted";
        } else {
            return "Scholership not granted";
        }
    }

    public static void main(String[] args) {
        System.out.println("Age 25: " + validAge(25));
        System.out.println("Age 61: " + validAge(61));
        System.out.println();

        System.out.println("Password for Closed interval: " + validPassClosed("12w3e4"));
        System.out.println("Password fro Open interval: " + validPassOpen("1qasdc0"));
        System.out.println();

        System.out.println("Java: " + validCourse("Java"));
        System.out.println("C: " + validCourse("C"));
        System.out.println();

        System.out.println(approvedScholership(true));
        System.out.println(approvedScholership(false));

    }
}
