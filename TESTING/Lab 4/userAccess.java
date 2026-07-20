/* Decision Table
A software company is developing a system to determine user access privileges for an online portal.
Access rules are as follows:
1. The user must be logged in to get access.
2. If the user is an admin, they have full access.
3. If the user is a premium member, they have limited access (not full admin
rights).
4. If the user is not logged in, they have no access at all*/

public class userAccess {
    public static String decision(boolean loggedIn, String role) {
        if (!loggedIn) {
            return "No access";
        } else if (role.equals("admin")) {
            return "Full access";
        } else if (role.equals("premium")) {
            return "Limited access";
        } else {
            return "Invalid";
        }
    }

    public static void main(String[] args) {
        Object[][] testCases = {
                { true, "admin" },
                { true, "premium" },
                { false, "admin" },
                { false, "premium" }
        };

        String[] expectedResults = {
                "Full access",
                "Limited access",
                "No access",
                "No access"
        };

        for (int i = 0; i < testCases.length; i++) {
            boolean loggedIn = (boolean) testCases[i][0];
            String role = (String) testCases[i][1];

            String result = decision(loggedIn, role);

            System.out.println("TC " + (i + 1) + ": LoggedIn= " + loggedIn + ", Role= " + role);
            System.out.println("Result: " + result + " | Expected result: " + expectedResults[i]);
            System.out.println();
        }
    }
}
